package com.example.demo.sts.service;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;
@Data @Lazy @Component
public class Subject {
	private int subNum;
	private String subject, description;
}
/*
create table subjects 
(sub_num int primary key auto_increment, 
subject varchar(20), description varchar(100))
 * */
