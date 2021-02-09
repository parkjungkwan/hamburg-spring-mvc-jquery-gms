package com.example.demo.sec.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.demo.sec.mapper.AuthMapper;
import com.example.demo.uss.domain.Manager;

@Service
public class AuthService implements UserDetailsService{
	@Autowired
	private AuthMapper authMapper;

	@Override
	public UserDetails loadUserByUsername(String inputUserId) {

		// 최종적으로 리턴해야할 객체
		Manager userDetails = new Manager();

		// 사용자 정보 select
		Manager manager = authMapper.selectUserInfoOne(inputUserId);

		// 사용자 정보 없으면 null 처리
		if (manager == null) {
			return null;

		// 사용자 정보 있을 경우 로직 전개 (userDetails에 데이터 넣기)
		} else {
			userDetails.setUsername(manager.getMgrNum());
			userDetails.setPassword(manager.getPassword());

			// 사용자 권한 select해서 받아온 List<String> 객체 주입
			//userDetails.setAuthorities(authMapper.selectUserAuthOne(inputUserId));
		}

		return userDetails;
	}
}
