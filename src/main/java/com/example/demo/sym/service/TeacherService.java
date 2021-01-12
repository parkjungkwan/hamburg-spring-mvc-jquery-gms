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
		
		var list = Arrays.asList("Java","Spring","Python","jQuery","eGovframe");
		var tlist = new ArrayList<Teacher>();
		Teacher t = null;
		for(int i=0; i< list.size(); i++) {
			t = dummy.makeTeacher();
			t.setSubject(list.get(i));
			tlist.add(t);
		}
    	teacherMapper.insertMany(tlist);
    }

}





