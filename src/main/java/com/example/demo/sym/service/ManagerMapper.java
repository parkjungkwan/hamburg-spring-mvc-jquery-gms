package com.example.demo.sym.service;

import org.springframework.stereotype.Repository;

@Repository
public interface ManagerMapper {

    public int insert(Manager manager);

	public Manager access(Manager manager);

	public int insertMany(int i);

}
