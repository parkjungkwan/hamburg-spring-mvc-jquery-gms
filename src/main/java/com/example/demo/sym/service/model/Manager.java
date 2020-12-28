package com.example.demo.sym.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;
/*
create table managers(
   mgr_num int primary key ,
   email varchar2(20),
   password varchar2(20)
   )
 */
@Data
@Component
public class Manager {
    private String mgrNum, email, password;
}
