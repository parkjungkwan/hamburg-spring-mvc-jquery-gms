package com.example.demo.cmm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
	@Autowired CommonMapper commonMapper;
	
	public int count(String tname) {
		return commonMapper.count(tname);
	}
	
}
