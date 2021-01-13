package com.example.demo.sym.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.sym.service.Manager;
import com.example.demo.sym.service.ManagerMapper;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.Teacher;
import com.example.demo.sym.service.TeacherMapper;
import com.example.demo.sym.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired TeacherService teacherService;
    @Autowired TeacherMapper teacherMapper;
    

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

}
