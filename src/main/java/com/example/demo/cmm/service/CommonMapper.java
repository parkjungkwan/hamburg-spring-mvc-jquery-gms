package com.example.demo.cmm.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface CommonMapper {
	public int totalCount(Map<?,?>map);
	public int dropTable(Map<?,?>map);
	public int createTable(Map<?,?>map);
	public int tableCount(Map<?,?> map);
}
