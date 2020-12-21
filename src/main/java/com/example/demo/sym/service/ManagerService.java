package com.example.demo.sym.service;

import com.example.demo.sym.service.model.Manager;

import org.springframework.stereotype.Component;

@Component
public interface ManagerService {

    public int register(Manager manager);

}
