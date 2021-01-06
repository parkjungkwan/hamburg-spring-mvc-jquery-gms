package com.example.demo.uss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.utl.DummyGenerator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
	@Autowired DummyGenerator gen;
    @Autowired
    StudentMapper studentMapper;

    public int register(Student s) {
        return studentMapper.insert(s);
    }
    
    public void insertMany(int count) {
    	for(int i=0; i < count; i++) {
    		studentMapper.insert(null);
    	}
    }

    public Student login(Student s) {
        return studentMapper.login(s);
    }

    public Student detail(String userid) {
        return studentMapper.selectById(userid);
    }

    public List<?> list() {
        return studentMapper.selectAll();
    }

    public int update(Student s) {
        return studentMapper.update(s);
    }

    public int delete(Student s) {
        return studentMapper.delete(s);
    }
    
}