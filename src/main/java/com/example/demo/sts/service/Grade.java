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
    private String subject, grade, examDate;
    private boolean passExam;
    
    public Grade(String subject, String examDate, int score) {
    	this.subject = subject;
    	this.examDate = examDate;
    	this.score = score;
    }
}
/*
create table grades(
   grade_num int primary key auto_increment,
   subject varchar(20),
   score varchar(20),
   grade varchar(20),
   stu_num int,
   exam_date varchar(20)
   
   )
   constraint grades_fk foreign key(stu_num) references students(stu_num)
 */
