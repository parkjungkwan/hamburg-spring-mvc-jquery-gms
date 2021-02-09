package com.example.demo.sec.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.uss.domain.Manager;
import com.example.demo.uss.domain.Student;
import com.example.demo.uss.domain.Teacher;

@Repository
public interface AuthMapper {
	public Manager loginManager(Manager manager);
	public Student loginStudent(Student student);
	public Teacher loginTeacher(Teacher student);
	public Manager selectUserInfoOne(String inputUserId);
	public Manager selectUserAuthOne(String inputUserId);
}
