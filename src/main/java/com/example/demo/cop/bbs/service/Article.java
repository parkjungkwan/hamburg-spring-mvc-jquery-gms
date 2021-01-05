package com.example.demo.cop.bbs.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.uss.service.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Article {
    private String artNum, title, content, count, writerNum;
}
/*
create table articles(
   art_num int primary key ,
   title varchar2(20),
   content varchar2(20),
   count varchar2(20),
   writer_num int)
 */
