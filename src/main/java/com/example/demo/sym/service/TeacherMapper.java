package com.example.demo.sym.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeVo;

@Repository
public interface TeacherMapper {
	public int insertMany(List<Teacher>list);
	public Teacher access(Teacher teacher);
	public int insert(Teacher teacher);
	public List<GradeVo> selectAll(Box<String> bx);
}
