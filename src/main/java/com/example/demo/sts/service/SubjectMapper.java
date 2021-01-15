package com.example.demo.sts.service;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;

@Repository
public interface SubjectMapper {
	public int insertMany(List<Subject>list);
	public List<String> selectAllSubject();
	public List<GradeVo> groupBySubject(Box<String> paramMap);
	public int insert(Subject s);

}
