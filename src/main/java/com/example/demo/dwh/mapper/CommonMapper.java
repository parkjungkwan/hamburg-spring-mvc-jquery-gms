package com.example.demo.dwh.mapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.dwh.domain.Box;

@Repository
public interface CommonMapper {
	public int totalCount(Map<?,?> map);
	public int dropTable(Map<?,?> map);
	public int createTable(Map<?,?> map);
	public int tableCount(Map<?,?> map);
}
