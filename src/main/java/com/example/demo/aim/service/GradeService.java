package com.example.demo.aim.service;
import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;

import com.example.demo.aim.domain.GradeVo;
import com.example.demo.aim.mapper.GradeMapper;
import com.example.demo.aim.service.GradeService;
import com.example.demo.dwh.domain.DummyGenerator;
import com.example.demo.dwh.domain.Vector;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GradeService {
	@Autowired GradeMapper gradeMapper;
	@Autowired DummyGenerator dummy;
	
	@Transactional
	public void insertMany() {
		// int stuNum, int subNum, String examDate, int score
		for(int i=1; i<= 100; i++ ) {
			for(int j=1; j<=5; j++) {
				gradeMapper.insert(dummy.makeGrade(i, j));
			}
		}
    }
	
	public Vector<GradeVo> selectAllforExam(String examDate){
		return gradeMapper.selectJoinAll(examDate);
	}
}
