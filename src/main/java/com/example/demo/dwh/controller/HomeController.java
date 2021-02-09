package com.example.demo.dwh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;
/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"ctx","cmm","mgr","tea","uss","grd"})
public class HomeController {
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index(HttpSession session, HttpServletRequest request) {
    	String ctx = request.getContextPath();
    	session.setAttribute("ctx", ctx);
    	session.setAttribute("cmm", ctx+"/resources/cmm");
    	session.setAttribute("mgr", ctx+"/resources/sym/mgr");
    	session.setAttribute("tea", ctx+"/resources/sym/tea");
    	session.setAttribute("stu", ctx+"/resources/uss");
    	session.setAttribute("sts", ctx+"/resources/sts");
        logger.info("Project Initialized ... ");
        
        return "index";
    }
    /*
     * uss (User Service Support) 디렉토리 이동시 user 사용
     * */
    @GetMapping("/user/{page}")
    public String user(@PathVariable String page) {
        logger.info("이동 파일: " + page);
        return String.format("user:%s", page);
    }
    /*
     * sym (System Manager) 디렉토리 이동시 admin 사용
     * */
    @GetMapping("/admin/{dir}/{page}") 
    public String admin(@PathVariable String dir, 
    						@PathVariable String page) {
        logger.info("이동 디렉토리: " + dir);
        logger.info("이동 파일: " + page);
        return String.format("admin:%s/%s", dir, page);
    }
    /*
     * sym (System Manager) 디렉토리 이동시 admin 사용
     * */
    @GetMapping("/mgr/{page}") 
    public String manager(@PathVariable String page) {
        logger.info("이동 파일: " + page);
        return String.format("mgr:%s", page);
    }
    @GetMapping("/tea/{page}") 
    public String teacher(@PathVariable String page) {
    	 logger.info("이동 파일: " + page);
         return String.format("tea:%s", page);
    }
    /*
     * cop (Content Operater) 디렉토리 이동시 content 사용
     * */
    @GetMapping("/content/{dir}/{page}") 
    public String content(@PathVariable String dir, 
    						@PathVariable String page) {
        logger.info("이동 디렉토리: " + dir);
        logger.info("이동 파일: " + page);
        return String.format("content:%s/%s", dir, page);
    }

  
	
}
