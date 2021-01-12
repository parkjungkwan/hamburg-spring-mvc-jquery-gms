package com.example.demo.sts.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data  @Lazy 
public class GradeVo { 
	//Grade
	private int gradeNum, score, stuNum;
    private String subject, grade, examDate, passExam;
    private int subNum, teaNum;
    // Subject
	private String description;
	// Teacher
	private String teaName, teaPassword, teaProfileImage;
	// Student
    private String userid, stuPassword, stuName, birthday, gender, 
    			regDate, stuProfileImage;
}
