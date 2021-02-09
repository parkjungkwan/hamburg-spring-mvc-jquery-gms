package com.example.demo.uss.controller;
import static com.example.demo.dwh.domain.Util.*;
import static java.util.stream.Collectors.*;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dwh.domain.Messenger;
import com.example.demo.uss.domain.Manager;
import com.example.demo.uss.mapper.ManagerMapper;
import com.example.demo.uss.service.ManagerService;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired ManagerService managerService;
    @Autowired ManagerMapper managerMapper;
    

    @PostMapping("")
    public Messenger register(@RequestBody Manager manager) {
        return (managerService.register(manager) == 1) 
        		? Messenger.SUCCESS 
        		: Messenger.FAILURE;
    }
    
  
}








