package com.example.demo.sym.service.impl;

import com.example.demo.cmm.mpr.ManagerMapper;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.model.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    

    @Override
    public int register(Manager manager) {
    	System.out.println("========== 1 ==========");
    	int a = 1;
    	System.out.println("========== 2 =========="+a);
        return a;
    }

}
