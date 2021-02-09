package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.sec.mapper.AuthMapper;
import com.example.demo.uss.domain.Manager;
import com.example.demo.uss.domain.Student;
import com.example.demo.uss.domain.Teacher;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Scope("session")
@Controller
@RequestMapping("/auth")
public class AurthController {
	private final AuthMapper authMapper;
	
	@PostMapping("/student/login")
	public Map<?,?> studentLogin(@RequestBody Student student){
		 var map = new HashMap<>();
	        Student result = authMapper.loginStudent(student);
	        map.put("message", result!=null?"SUCCESS":"FAILURE");
	        map.put("sessionUser", result);
	        return map;
	}
	@PostMapping("/teacher/login")
	public Map<?,?> teacherLogin(@RequestBody Teacher teacher){
		 var map = new HashMap<>();
		 	Teacher result = authMapper.loginTeacher(teacher);
	        map.put("message", result!=null?"SUCCESS":"FAILURE");
	        map.put("sessionUser", result);
	        return map;
	}
	@PostMapping("/manager/login")
	public Map<?,?> managerLogin(@RequestBody Manager manager){
		 var map = new HashMap<>();
		 	Manager result = authMapper.loginManager(manager);
	        map.put("message", result!=null?"SUCCESS":"FAILURE");
	        map.put("sessionUser", result);
	        return map;
	}
	 
}
