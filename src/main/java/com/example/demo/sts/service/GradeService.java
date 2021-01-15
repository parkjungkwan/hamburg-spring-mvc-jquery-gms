package com.example.demo.sts.service;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;
import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.sts.service.GradeService;

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
	
	public List<GradeVo> selectAllforExam(String examDate){
		return gradeMapper.selectJoinAll(examDate);
	}
}
