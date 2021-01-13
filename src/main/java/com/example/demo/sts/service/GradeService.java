package com.example.demo.sts.service;

import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.sts.service.GradeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
	@Autowired GradeMapper gradeMapper;
	@Autowired DummyGenerator dummy;
	
	public void insertMany(int count) {
		// int stuNum, int subNum, String examDate, int score
		var list = new ArrayList<Grade>();
		Grade g = null;
		for(int i=0; i< 100; i++) {
			g = dummy.makeGrade((i+1));
			g.setStuNum(i);
			list.add(g);
		}
    	gradeMapper.insertMany(list);
    }
}
