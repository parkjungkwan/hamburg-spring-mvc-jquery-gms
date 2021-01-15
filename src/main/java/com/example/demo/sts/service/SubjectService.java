package com.example.demo.sts.service;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;

import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.cmm.utl.Inventory;
import com.example.demo.sts.service.GradeService;
import com.example.demo.sym.service.TeacherMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	@Autowired SubjectMapper subjectMapper;
	@Autowired TeacherMapper teacherMapper;
	@Autowired DummyGenerator dummy;
	@Autowired Inventory<Subject> ls;
	@Autowired Box<List<GradeVo>> bx;
	
	public void insertMany(int count) {
		
		var l1 = Arrays.asList("Java","Spring","Python","jQuery","eGovframe");
		var l2 = Arrays.asList("Java 언어","Spring 프레임워크","Python 언어","jQuery 라이브러리","전자정부 ");
		Subject s = null;
		
		for(int i=0; i< count; i++) {
			s = new Subject();
			s.setDescription(l2.get(i));
			s.setSubject(l1.get(i));
			ls.add(s);
		}
		subjectMapper.insertMany(ls.get());
    }
	
	public List<GradeVo> groupBySubject(Box<String> param){
    	bx.put("groupBy", teacherMapper.selectAll(param));
		return Arrays.asList();
	}
}


