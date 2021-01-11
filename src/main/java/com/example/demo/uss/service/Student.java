package com.example.demo.uss.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Student {
	private int stuNum;
    private String userid, password, name, birthday, gender, 
    			regDate, profileImage, subject;
}
/*
create table students(
   stu_num int primary key ,
   userid varchar2(20),
   password varchar2(20),
   name varchar2(20),
   ssn varchar2(20),
   reg_date varchar2(20),
   tea_num int,
   subject varchar2(20),
   profile_image varchar2(100)
   constraint students_fk foreign key(tea_num) references teachers(tea_num)
   )
 */