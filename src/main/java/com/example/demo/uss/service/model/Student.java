package com.example.demo.uss.service.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Student {
    private String stuNum, userid, password, name, ssn, regDate;
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
   constraint students_fk foreign key(tea_num) refernces teachers(tea_num)
   )
 */