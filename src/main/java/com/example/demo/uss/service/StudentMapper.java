package com.example.demo.uss.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {

	public int insert(Student s);

	public Student login(Student s);

	public Student selectById(String userid);

	public List<Student> selectAll(HashMap<String, String> map);

	public int update(Student s);

	public int delete(Student s);

	public void truncate(HashMap<String, String> map);

	public int count(HashMap<String, String> map);
    
}