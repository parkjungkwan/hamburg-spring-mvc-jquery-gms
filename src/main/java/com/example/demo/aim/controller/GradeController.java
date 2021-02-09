package com.example.demo.aim.controller;
import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import com.example.demo.aim.domain.Grade;
import com.example.demo.aim.mapper.GradeMapper;
import com.example.demo.aim.service.GradeService;
import com.example.demo.dwh.domain.Box;
import com.example.demo.dwh.domain.Messenger;
import com.example.demo.dwh.domain.Pagination;
import com.example.demo.dwh.domain.Sql;
import com.example.demo.dwh.domain.Table;
import com.example.demo.dwh.domain.Util;
import com.example.demo.dwh.mapper.CommonMapper;
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

@RequestMapping("/grades")
@RestController
public class GradeController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired StudentService studentService;
    @Autowired GradeService gradeService;
    @Autowired StudentMapper studentMapper;
    @Autowired GradeMapper gradeMapper;
    @Autowired SubjectService subjectService;
    @Autowired TeacherService teacherService;
    @Autowired ManagerService managerService;
    @Autowired CommonMapper commonMapper;
    @Autowired Pagination page;
    
    @PostMapping("")
    public Messenger register(@RequestBody Grade g){
        return gradeMapper.insert(g)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
   
    @GetMapping("/register")
    public Messenger registerMany(){
    	var map = new HashMap<String, String>();
    	logger.info("Grade List Register ...");
    	gradeService.insertMany();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.GRADES);	
        return commonMapper.totalCount(map)!=0?Messenger.SUCCESS:Messenger.FAILURE;
    }
    
    
	
}
