package com.example.demo.uss.service;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;
import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.enm.Table;
import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.cmm.utl.Pagination;

import static java.util.stream.Collectors.toList;
import static com.example.demo.cmm.utl.Util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
	@Autowired DummyGenerator dummy;
    @Autowired StudentMapper studentMapper;
    @Autowired Box<String> bx;
    @Transactional
    public int insertMany(int count) {
    	for(int i=0; i < count; i++) {
    		studentMapper.insert(dummy.makeStudent());
    	}
    	return count(); 
    }
    @Transactional
    public int truncate() {
    	bx.clear();
    	bx.put("TRUNCATE_STUDENTS", Sql.TRUNCATE.toString() + Table.STUDENTS);
    	studentMapper.truncate(bx);
    	return count() != 0 ? 0 : 1;
    }
    
    public int count() {
    	bx.clear();
    	bx.put("COUNT_STUDENTS", Sql.TOTAL_COUNT.toString() +  Table.STUDENTS);
    	return studentMapper.count(bx);
    }
    
    public List<Student> list(Pagination page){
    	return studentMapper.list().stream()
    			.sorted(comparing(Student::getStuNum).reversed())
    			.skip(page.getPageSize() * (page.getPageNum()-1))
    			.limit(page.getPageSize())
    			.collect(Collectors.toList());
    }
    
    /*public List<Student> selectByGender(String gender){
    	return list().stream()
    			
    			.collect(toList());
    }*/
    
}