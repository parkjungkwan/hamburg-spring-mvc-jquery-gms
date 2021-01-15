package com.example.demo.sts.service;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;
import java.util.stream.Collectors;

import com.example.demo.cmm.enm.SubjectCate;
import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.cmm.utl.Vector;
import com.example.demo.sts.service.GradeService;
import com.example.demo.sym.service.TeacherMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	@Autowired SubjectMapper subjectMapper;
	@Autowired TeacherMapper teacherMapper;
	@Autowired DummyGenerator dummy;
	@Autowired Vector<Subject> vcSubject;
	@Autowired Vector<GradeVo> vcGradeVo;
	@Autowired Box<Vector<GradeVo>> bx;
	
	public void insertMany(int count) {
		
		var l1 = Arrays.asList("Java","Spring","Python","jQuery","eGovframe");
		var l2 = Arrays.asList("Java 언어","Spring 프레임워크","Python 언어","jQuery 라이브러리","전자정부 ");
		Subject s = null;
		vcSubject.clear();
		for(int i=0; i< count; i++) {
			s = new Subject();
			s.setDescription(l2.get(i));
			s.setSubject(l1.get(i));
			vcSubject.add(s);
		}
		subjectMapper.insertMany(vcSubject.get());
    }
	
	public Vector<GradeVo> groupBySubject(Box<String> bx){
		System.out.println(">>>>>>>>>>>>");
		List<GradeVo> l = subjectMapper
				.groupBySubject(bx.get());
		System.out.println("그래이드 총 카운트: "+ l.size());
		//l.forEach(System.out::println);
		
		//211
		//List<GradeVo> l = vcGradeVo.get();
		//l.stream().collect(Collectors.groupingBy()});
		Map<Integer, List<GradeVo>> m 
        = l.stream().collect( groupingBy(GradeVo::getSubNum)); 
    	//bx.put("groupBy", teacherMapper.selectAll(param.get()));
		List<GradeVo> l2 = m.get(integer.apply(bx.get("subNum")));
		l2.forEach(System.out::println);
		return vcGradeVo;
	}
	public Vector<GradeVo> groupByGrade(Box<String> bx){
		List<GradeVo> l = subjectMapper
				.groupBySubject(bx.get());
		
		Map<Object, List<GradeVo>> m 
        = l.stream().collect( groupingBy(
        		return gradeVo -> {
        			if(true) return SubjectCate.GRADE_A;
        		}
        		)); 
		List<GradeVo> l2 = m.get(integer.apply(bx.get("subNum")));
		l2.forEach(System.out::println);
		return vcGradeVo;
	}
}










