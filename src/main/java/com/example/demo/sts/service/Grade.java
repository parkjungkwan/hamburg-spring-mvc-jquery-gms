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
	private int grdNum, score, stuNum, subNum;
    private String grade, examDate, passExam;
    
    public Grade(int stuNum, int subNum, String examDate, int score) {
    	this.subNum = subNum;
    	this.examDate = examDate;
    	this.score = score;
    	this.stuNum = stuNum;
    }
}
