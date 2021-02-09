package com.example.demo.uss.mapper;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.stereotype.Repository;

import com.example.demo.aim.domain.GradeVo;
import com.example.demo.uss.domain.Teacher;

@Repository
public interface TeacherMapper {
	public int insertMany(List<Teacher>list);
	public Teacher access(Teacher teacher);
	public int insert(Teacher teacher);
	public Vector<GradeVo> selectAll(Map<?,?> map);
}
