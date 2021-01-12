package com.example.demo.sts.service;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMapper {
	public int insertMany(List<Subject>list);

}
