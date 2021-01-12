package com.example.demo.sts.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.uss.service.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Grade {
	private int gradeNum, score, stuNum;
    private String subject, grade, examDate, passExam;
    
    public Grade(String subject, String examDate, int score) {
    	this.subject = subject;
    	this.examDate = examDate;
    	this.score = score;
    }
}
