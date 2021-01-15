package com.example.demo.sym.service;


import static com.example.demo.cmm.utl.Util.integer;
import static com.example.demo.cmm.utl.Util.mySkip;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.toList;

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

import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.cmm.utl.Pagination;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeMapper;
import com.example.demo.sts.service.GradeVo;
import com.example.demo.sts.service.SubjectMapper;

@Service
public class TeacherService {
	@Autowired TeacherMapper teacherMapper;
	@Autowired SubjectMapper subjectMapper;
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
	public Map<?,?> selectAllBySubject(Map<?,?> paramMap){
		String pageNum = paramMap.get("pageNum").toString();
		String pageSize = paramMap.get("pageSize").toString();
		var map = new HashMap<String,Object>();
		List<GradeVo> list = teacherMapper.selectAll(paramMap);
    	map.clear();
    	
    	IntSummaryStatistics is =list.stream().collect(summarizingInt(GradeVo::getScore));// 204
    	map.put("max", is.getMax());
    	map.put("min", is.getMin());
    	map.put("sum", is.getSum());
    	map.put("avg", is.getAverage());
    	map.put("count", is.getCount());
    	
    	System.out.println(is);
    	
    	map.put("list", list.stream()
			    	    	.skip(mySkip.apply(pageNum, pageSize))
			    	    	.limit(integer.apply(pageSize))
			    	    	.collect(toList()));
    	
    	map.put("page", new Pagination(integer.apply(pageSize), 
    								   integer.apply(pageNum), 
    								   list.size()));   
    	
    	map.put("subjects",subjectMapper.selectAllSubject()
					    	.stream()
					    	.collect(joining(",")));
    	
    	Optional<GradeVo> highScoreGrade = list.stream()
    			.collect(reducing( (g1, g2) -> g1.getScore() > g2.getScore() ? g1 : g2 ));
    	
		return null;
	}

}





