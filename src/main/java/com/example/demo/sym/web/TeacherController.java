package com.example.demo.sym.web;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.enm.Table;
import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.Pagination;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeVo;
import com.example.demo.sts.service.SubjectMapper;
import com.example.demo.sym.service.Manager;
import com.example.demo.sym.service.ManagerMapper;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.Teacher;
import com.example.demo.sym.service.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import java.util.IntSummaryStatistics;
@RestController
@RequestMapping("/teachers")
public class TeacherController {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired TeacherService teacherService;
    @Autowired TeacherMapper teacherMapper;
    @Autowired SubjectMapper subjectMapper;
    @Autowired Box<String> bx;
    

    @PostMapping("")
    public Messenger register(@RequestBody Teacher teacher) {
        return (teacherService.register(teacher) == 1) 
        		? Messenger.SUCCESS 
        		: Messenger.FAILURE;
    }
    
    @PostMapping("/access")
    public Teacher access(@RequestBody Teacher teacher) {
    	return teacherMapper.access(teacher);
    }
    /**
     * 해당 교강사가 담당하는 과목의 최근 시험결과에 따른 결과반환
     * 
     * */
    @GetMapping("/page/{pageSize}/{pageNum}/subject/{subNum}/{examDate}")
    public Map<?,?> selectAllBySubject(
    		@PathVariable String pageSize, 
			@PathVariable String pageNum,
    		@PathVariable String subNum,
    		@PathVariable String examDate){
    	logger.info(" selectAllBySubject Executed ...");
    	bx.put("pageSize", pageSize);
    	bx.put("pageNum", pageNum);
    	bx.put("subNum", subNum);
    	bx.put("examDate", examDate);
    	teacherService.selectAllBySubject(bx);
    	
    	return null;
    }
  
} 










