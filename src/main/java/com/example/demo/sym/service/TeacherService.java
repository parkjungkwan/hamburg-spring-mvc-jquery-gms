package com.example.demo.sym.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeMapper;

@Service
public class TeacherService {
	@Autowired TeacherMapper teacherMapper;
	@Autowired DummyGenerator dummy;
	
	public void insertMany(int count) {
		
		// teacher 는 subject 수인 5까지만 입력
		var tlist = new ArrayList<Teacher>();
		Teacher t = null;
		
		for(int i=0; i< count; i++) {
			t = dummy.makeTeacher(i+1);
			tlist.add(t);
		}
    	teacherMapper.insertMany(tlist);
    }

	public int register(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherMapper.insert(teacher);
	}

}





