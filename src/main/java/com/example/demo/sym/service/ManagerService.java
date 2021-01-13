package com.example.demo.sym.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.sts.service.Grade;

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
