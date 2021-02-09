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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@RestController
@RequestMapping("/managers")
public class ManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired ManagerService managerService;
    @Autowired ManagerMapper managerMapper;
    @Autowired
	private BCryptPasswordEncoder pwEncoder;

    @PostMapping("")
    public Messenger register(@RequestBody Manager manager) {
    	// 존재하는 ID 여부 확인
    			Integer userCount = managerMapper.selectUserInfoCount("");
    			if (userCount > 0) {
    				// return ;

    			} else {

    				// userInfo의 내용 중 패스워드를 암호화시켜서 바꿔줌
    				// userInfo.setUserPw(pwEncoder.encode(userInfo.getUserPw()));

    				
    				// 회원정보 및 디폴트 권한 DB 입력
    				// mapper.insertUserInfo(userInfo);
    				// mapper.insertUserAuthDefault(userInfo.getUserId());
    				// return true;
    			}
        return (managerService.register(manager) == 1) 
        		? Messenger.SUCCESS 
        		: Messenger.FAILURE;
    }
    
  
}








