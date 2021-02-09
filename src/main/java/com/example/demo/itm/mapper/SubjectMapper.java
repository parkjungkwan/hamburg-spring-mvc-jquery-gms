package com.example.demo.itm.mapper;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.aim.domain.GradeVo;
import com.example.demo.dwh.domain.Box;
import com.example.demo.dwh.domain.Vector;
import com.example.demo.itm.domain.Subject;

@Repository
public interface SubjectMapper {
	public int insertMany(List<Subject>list);
	public List<String> selectAllSubject();
	public List<GradeVo> groupBySubject(Map<?,?> paramMap);
	public int insert(Subject s);

}
