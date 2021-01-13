package com.example.demo.sym.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.sts.service.Grade;

@Repository
public interface TeacherMapper {
	public int insertMany(List<Teacher>list);
	public Teacher access(Teacher teacher);
	public int insert(Teacher teacher);
	
}
