package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public Map<?,?> studentLogin(@ModelAttribute Student student){
		 var map = new HashMap<>();
	        Student result = authMapper.loginStudent(student);
	        map.put("message", result!=null?"SUCCESS":"FAILURE");
	        map.put("sessionUser", result);
	        return map;
	}
	@PostMapping("/teacher/login")
	public Map<?,?> teacherLogin(@ModelAttribute Teacher teacher){
		 var map = new HashMap<>();
		 	Teacher result = authMapper.loginTeacher(teacher);
	        map.put("message", result!=null?"SUCCESS":"FAILURE");
	        map.put("sessionUser", result);
	        return map;
	}
	@PostMapping("/manager/login")
	public Map<?,?> managerLogin(@ModelAttribute Manager manager){
		 var map = new HashMap<>();
		 	Manager result = authMapper.loginManager(manager);
	        map.put("message", result!=null?"SUCCESS":"FAILURE");
	        map.put("sessionUser", result);
	        return map;
	}
	/* 로그인 화면 요청 */
	@RequestMapping("/loginView")
	public String loginView(HttpServletRequest request) {

		// 요청 시점의 사용자 URI 정보를 Session의 Attribute에 담아서 전달(잘 지워줘야 함)
		// 로그인이 틀려서 다시 하면 요청 시점의 URI가 로그인 페이지가 되므로 조건문 설정
		String uri = request.getHeader("Referer");
		if (!uri.contains("/loginView")) {
			request.getSession().setAttribute("prevPage",
					request.getHeader("Referer"));
		}
		
		/* 로그인 버튼 눌러 접속했을 경우의 데이터 get */
		String prevPage = (String) request.getSession().getAttribute("prevPage");
		
		if (prevPage != null) {
			request.getSession().removeAttribute("prevPage");
        
		// if (인터셉트 당했을 경우)
        // ....
        
		// ""가 아니라면 직접 로그인 페이지로 접속한 것
		} else if (prevPage != null && !prevPage.equals("")) {
			uri = prevPage;
		}

		return "/user/login";
	}
	 
}
