package com.example.demo.sym.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.uss.service.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
create table managers(
   mgr_num int primary key ,
   email varchar2(20),
   password varchar2(20)
   )
 */
@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Manager {
    private String mgrNum, email, password;
}
