package com.example.demo.uss.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dwh.domain.Box;
import com.example.demo.dwh.domain.Pagination;
import com.example.demo.uss.domain.Student;

@Repository
public interface StudentMapper {

	public int insert(Student s);
	public Student login(Student s);
	public List<Student> selectAll(Pagination page);
	public List<Student> list();
	public int update(Student s);
	public int delete(Student s);
	public void truncate(Box<String> bx);
	public int count(Box<String> bx);
    
}