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
	
	public Vector<GradeVo> groupBySubject(Box<String> bx){ //210
		List<GradeVo> l = subjectMapper.groupBySubject(bx.get());
		Map<Integer, List<GradeVo>> m 
        = l.stream().collect( groupingBy(GradeVo::getSubNum)); 
		List<GradeVo> l2 = m.get(integer.apply(bx.get("subNum")));
		l2.forEach(System.out::println);
		return vcGradeVo;
	}
	public Vector<GradeVo> groupByGrade(Box<String> bx){ // 211
		List<GradeVo> l = subjectMapper
				.groupBySubject(bx.get());
		
		Map<SubjectCate, List<GradeVo>> m 
        = l.stream().collect( 
        		groupingBy( gradeVo -> {
        			 if(gradeVo.getScore() > 90) return SubjectCate.GRADE_A;
        			 if(gradeVo.getScore() > 80) return SubjectCate.GRADE_B;
        			 if(gradeVo.getScore() > 70) return SubjectCate.GRADE_C;
        			 if(gradeVo.getScore() > 60) return SubjectCate.GRADE_D;
        			 if(gradeVo.getScore() > 50) return SubjectCate.GRADE_E;
        			 else return SubjectCate.GRADE_F;
        		})); 
		List<GradeVo> l2 = m.get(SubjectCate.GRADE_B);
		l2.forEach(System.out::println);
		return vcGradeVo;
	}
	public Vector<GradeVo> filterBySubject(Box<String> bx){ // 212
		List<GradeVo> l = subjectMapper
				.groupBySubject(bx.get());
		
		Map<Integer, List<GradeVo>> m 
	        = l.stream()
	        .filter(grade -> grade.getScore() > 70)
	        .collect(groupingBy( GradeVo::getSubNum)); 
		List<GradeVo> l2 = m.get(1);
		l2.forEach(System.out::println);
		return vcGradeVo;
	}
}










