package com.example.demo.itm.controller;
import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.demo.aim.mapper.GradeMapper;
import com.example.demo.aim.service.GradeService;
import com.example.demo.dwh.domain.Box;
import com.example.demo.dwh.domain.Messenger;
import com.example.demo.dwh.domain.Pagination;
import com.example.demo.dwh.domain.Sql;
import com.example.demo.dwh.domain.Table;
import com.example.demo.dwh.domain.Util;
import com.example.demo.dwh.mapper.CommonMapper;
import com.example.demo.itm.domain.Subject;
import com.example.demo.itm.mapper.SubjectMapper;
import com.example.demo.itm.service.SubjectService;
import com.example.demo.uss.domain.Student;
import com.example.demo.uss.mapper.StudentMapper;
import com.example.demo.uss.mapper.TeacherMapper;
import com.example.demo.uss.service.ManagerService;
import com.example.demo.uss.service.StudentService;
import com.example.demo.uss.service.TeacherService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/subjects")
@RestController
public class SubjectController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired StudentService studentService;
    @Autowired GradeService gradeService;
    @Autowired StudentMapper studentMapper;
    @Autowired GradeMapper gradeMapper;
    @Autowired TeacherMapper teacherMapper;
    @Autowired SubjectMapper subjectMapper;
    @Autowired SubjectService subjectService;
    @Autowired TeacherService teacherService;
    @Autowired ManagerService managerService;
    @Autowired CommonMapper commonMapper;
    @Autowired Pagination page;
    @Autowired Box<String> bx;
    
    @PostMapping("")
    public Messenger register(@RequestBody Subject s){
    	
    	// Get the List 
        List<String> g 
            = Arrays.asList("geeks", "for", "geeks"); 
  
        // Collect the list as map 
        // by groupingBy() method 
       subjectService.groupBySubject(bx);
        return subjectMapper.insert(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
   
    @GetMapping("/groupBy/{examDate}/{subNum}")
    public Map<?,?> totalScoreGroupBySubject(
    		@PathVariable String examDate,
    		@PathVariable String subNum){
    	bx.put("examDate", examDate);
    	bx.put("subNum", subNum);
    	subjectService.groupBySubject(bx);
    	return null;
    }
    @GetMapping("/groupByGrade/{examDate}/{subNum}")
    public Map<?,?> groupByGrade(
    		@PathVariable String examDate,
    		@PathVariable String subNum){
    	bx.put("examDate", examDate);
    	bx.put("subNum", subNum);
    	subjectService.groupBySubject(bx);
    	return null;
    }
    
    
    

}









