package com.example.demo.cmm.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;

@Repository
public interface CommonMapper {
	public int totalCount(Box<String>bx);
	public int dropTable(Box<String>bx);
	public int createTable(Box<String>bx);
	public int tableCount(Box<String>bx);
}
