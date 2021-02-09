package com.example.demo.uss.service;
import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.aim.domain.Grade;
import com.example.demo.dwh.domain.DummyGenerator;
import com.example.demo.uss.domain.Manager;
import com.example.demo.uss.mapper.ManagerMapper;

@Service
public class ManagerService {
    @Autowired ManagerMapper managerMapper;
    @Autowired DummyGenerator dummy;

    public int register(Manager manager) {
        return managerMapper.insert(manager);
    }

	public int insertMany(int count) {
		var list = new ArrayList<Manager>();
		Manager m = null;
		for(int i=0; i< count; i++) {
			m = dummy.makeManager();
			list.add(m);
		}
		return managerMapper.insertMany(list);
	}

}
