package com.example.demo.uss.service;


import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.aim.domain.Grade;
import com.example.demo.aim.domain.GradeVo;
import com.example.demo.aim.mapper.GradeMapper;
import com.example.demo.dwh.domain.Box;
import com.example.demo.dwh.domain.DummyGenerator;
import com.example.demo.dwh.domain.Pagination;
import com.example.demo.itm.mapper.SubjectMapper;
import com.example.demo.uss.domain.Teacher;
import com.example.demo.uss.mapper.TeacherMapper;

@Service
public class TeacherService {
	@Autowired TeacherMapper teacherMapper;
	@Autowired SubjectMapper subjectMapper;
	@Autowired DummyGenerator dummy;
	@Autowired Box<Object> bx;
	
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
	public Map<?,?> selectAllBySubject(Box<String> param){
		String pageNum = param.get("pageNum").toString();
		String pageSize = param.get("pageSize").toString();
		
		List<GradeVo> list = teacherMapper.selectAll(param.get());
    	
    	
    	IntSummaryStatistics is =list.stream().collect(summarizingInt(GradeVo::getScore));// 204
    	bx.put("max", is.getMax());
    	bx.put("min", is.getMin());
    	bx.put("sum", integer.apply(
    			string.apply(is.getSum())));
    	bx.put("avg", integer.apply(
    			string.apply(is.getAverage())));
    	bx.put("count", integer.apply(
    			string.apply(is.getCount())));
    	
    	
    	bx.put("list", list.stream()
			    	    	.skip(mySkip.apply(pageNum, pageSize))
			    	    	.limit(integer.apply(pageSize))
			    	    	.collect(toList()));
    	
    	bx.put("page", new Pagination(integer.apply(pageSize), 
    								   integer.apply(pageNum), 
    								   list.size()));   
    	
    	bx.put("subjects",subjectMapper.selectAllSubject()
					    	.stream()
					    	.collect(joining(",")));
    	
    	Optional<GradeVo> highScoreGrade = list.stream()
    			.collect(reducing( (g1, g2) -> g1.getScore() > g2.getScore() ? g1 : g2 ));
    	bx.put("highScoreGrade", highScoreGrade);
		return bx.get();
	}

}





