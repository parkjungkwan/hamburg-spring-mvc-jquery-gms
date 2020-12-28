package com.example.demo.cop.bbs.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
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
