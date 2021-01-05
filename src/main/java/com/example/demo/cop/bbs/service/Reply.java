package com.example.demo.cop.bbs.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.uss.service.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Reply extends Article {
    private String replyNum, content, artNum;
}
/*
create table replies(
   reply_num int primary key ,
   content varchar2(20),
   art_num int,
   constraint replies_fk foreign key(art_num) references articles(art_num)
   )
 */
