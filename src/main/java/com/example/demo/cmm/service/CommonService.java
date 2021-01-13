package com.example.demo.cmm.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.cmm.enm.Sql;

@Service
public class CommonService {
	@Autowired CommonMapper commonMapper;
	
	@Transactional
	public int generateDB() {
		var map = new HashMap<String,String>();
		List<String> l1 = Arrays.asList(
				Sql.DROP_TABLE.toString()+"managers",
				Sql.DROP_TABLE.toString()+"subjects",
				Sql.DROP_TABLE.toString()+"students",
				Sql.DROP_TABLE.toString()+"teachers",
				Sql.DROP_TABLE.toString()+"grades",
				Sql.DROP_TABLE.toString()+"articles",
				Sql.DROP_TABLE.toString()+"replies")
		;
		List<String> l2 = Arrays.asList(
				Sql.CREATE_MANAGERS.toString(),
				Sql.CREATE_SUBJECTS.toString(),
				Sql.CREATE_STUDENTS.toString(),
				Sql.CREATE_TEACHERS.toString(),
				Sql.CREATE_GRADES.toString(),
				Sql.CREATE_ARTICLES.toString(),
				Sql.CREATE_REPLIES.toString())
		;
		for(int i=0; i< l1.size(); i++) {
			map.put("DROP_TABLE", l1.get(i));
			commonMapper.dropTable(map);
			map.clear();
			map.put("CREATE_TABLE", l2.get(i));
			commonMapper.generateDB(map);
			map.clear();
		}
		map.put("TABLE_COUNT", Sql.TABLE_COUNT.toString());
		return (commonMapper.tableCount(map)!=0) ? 1: 0;
	}
	public int totalCount() {
		var map = new HashMap<String,String>();
		return 0;
	}
	public int dropTable() {
		var map = new HashMap<String,String>();
		return 0;
	}
	
}
