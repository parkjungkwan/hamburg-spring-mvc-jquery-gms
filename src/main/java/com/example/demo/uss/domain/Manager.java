package com.example.demo.uss.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/* Spring Security 로그인을 위한 UserDetails VO 객체 */
@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Manager implements UserDetails  {
    private String mgrNum, email, name, profileImage;

 // 안만들어도 상관없지만 Warning이 발생함
 	private static final long serialVersionUID = 1L;

 	private String username; // ID
 	private String password; // PW
 	private List<GrantedAuthority> authorities;

 	
 	// setter
 	public void setAuthorities(List<String> authList) {

 		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

 		for (int i = 0; i < authList.size(); i++) {
 			authorities.add(new SimpleGrantedAuthority(authList.get(i)));
 		}

 		this.authorities = authorities;
 	}

 	

 	@Override
 	// 권한
 	public Collection<? extends GrantedAuthority> getAuthorities() {

 		return authorities;
 	}

 	@Override
 	// 계정이 만료 되지 않았는가?
 	public boolean isAccountNonExpired() {

 		return true;
 	}

 	@Override
 	// 계정이 잠기지 않았는가?
 	public boolean isAccountNonLocked() {

 		return true;
 	}

 	@Override
 	// 패스워드가 만료되지 않았는가?
 	public boolean isCredentialsNonExpired() {

 		return true;
 	}

 	@Override
 	// 계정이 활성화 되었는가?
 	public boolean isEnabled() {

 		return true;
 	}
}
