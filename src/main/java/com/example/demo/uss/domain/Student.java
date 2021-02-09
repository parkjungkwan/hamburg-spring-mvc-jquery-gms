package com.example.demo.uss.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.dwh.domain.Path;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Student {
	private int stuNum, mgrNum;
    private String userid, password, name, birthday, gender, 
    			regDate, profileImage;
    public Student(String userid, 
			String password, 
			String name, 
			String birthday, 
			String gender,
			String regDate,
			String profileImage,int mgrNum) {
    	this.userid = userid;
    	this.password = password;
    	this.name = name;
    	this.birthday = birthday;
    	this.gender = gender;
    	this.regDate = regDate;
    	this.profileImage = profileImage;
    	this.mgrNum = mgrNum;
    }
}
