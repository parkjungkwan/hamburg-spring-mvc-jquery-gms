package com.example.demo.sym.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.uss.service.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Teacher {
    private String teaNum, name, password, subject, profileImage;
    
    public Teacher(String name, String password, String subject, String profileImage) {
    	this.name = name;
    	this.password = password;
    	this.subject = subject;
    	this.profileImage = profileImage;
    }

}
