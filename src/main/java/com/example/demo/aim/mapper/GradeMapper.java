package com.example.demo.aim.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.aim.domain.Grade;
import com.example.demo.aim.domain.GradeVo;
import com.example.demo.dwh.domain.Vector;

@Repository
public interface GradeMapper {
	public int insertMany(Vector<Grade>vc);
	public Vector<GradeVo> selectJoinAll(String examDate);
	public int insert(Grade grade);
	public Vector<Grade> selectSome(Grade grade);
	public Grade selectOne(Grade grade);
	public int update(Grade grade);
	public int delete(Grade grade);
}
