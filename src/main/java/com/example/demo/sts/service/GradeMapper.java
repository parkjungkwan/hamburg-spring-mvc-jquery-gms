package com.example.demo.sts.service;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GradeMapper {
	public int insertMany(List<Grade>list);
	public List<GradeVo> selectJoinAll(String examDate);
	public int insert(Grade grade);
	public List<Grade> selectSome(Grade grade);
	public Grade selectOne(Grade grade);
	public int update(Grade grade);
	public int delete(Grade grade);
}
