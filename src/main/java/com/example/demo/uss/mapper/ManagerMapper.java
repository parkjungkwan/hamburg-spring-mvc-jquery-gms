package com.example.demo.uss.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uss.domain.Manager;

@Repository
public interface ManagerMapper {

    public int insert(Manager manager);

	

	public int insertMany(List<Manager> list);

}
