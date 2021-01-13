package com.example.demo.sym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ManagerMapper {

    public int insert(Manager manager);

	public Manager access(Manager manager);

	public int insertMany(List<Manager> list);

}
