package com.example.demo.sym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired ManagerMapper managerMapper;

    public int register(Manager manager) {
        return managerMapper.insert(manager);
    }

}
