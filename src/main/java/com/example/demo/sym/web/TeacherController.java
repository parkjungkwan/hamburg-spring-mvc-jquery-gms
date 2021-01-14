package com.example.demo.sym.web;

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
    @Autowired Box<Object> box;
    

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
  
    @GetMapping("/page/{pageSize}/{pageNum}/subject/{subNum}/{examDate}")
    public Map<?,?> selectAllBySubject(
    		@PathVariable String pageSize, 
			@PathVariable String pageNum,
    		@PathVariable String subNum,
    		@PathVariable String examDate){
    	logger.info("/\n***************************************\n"
    			+ "해당 교강사가 담당하는 과목의 최근 시험결과에 따른 결과반환\n"
    			+ "******************************************\n");
    	var map = new HashMap<String, Object>();
    	map.put("examDate", examDate);
    	map.put("subNum", subNum);
    	List<GradeVo> list = teacherMapper.selectAll(map);
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
    	
    	
    	return map;
    }
  
} 










