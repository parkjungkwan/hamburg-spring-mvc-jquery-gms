package com.example.demo.uss.web;

import java.util.Map;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.utl.Util;
import com.example.demo.uss.service.Student;
import com.example.demo.uss.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired StudentService studentService;
    @PostMapping("")
    public Messenger register(@RequestBody Student s){
        return studentService.register(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    @PostMapping("/login")
    public Map<?,?> login(@RequestBody Student s){
        var map = new HashMap<>();
        Student result = studentService.login(s);
        map.put("message", result!=null?"SUCCESS":"FAILURE");
        map.put("sessionUser", result);
        return map;
    }
    @GetMapping("/{userid}")
    public Student profile(@PathVariable String userid){
        return studentService.detail(userid);
    }
    @GetMapping("")
    public List<?> list(){
        return studentService.list();
    }
    @PutMapping("")
    public Messenger update(@RequestBody Student s){
        return studentService.update(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    @DeleteMapping("")
    public Messenger delete(@RequestBody Student s){
        return studentService.delete(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    @GetMapping("/truncate")
    public Messenger truncate() {
    	return Messenger.SUCCESS;
    }
}