package com.example.demo.cmm.service;

import org.springframework.stereotype.Repository;

@Repository("mapper")
public interface CommonMapper {
	public int count(String tname);
}
