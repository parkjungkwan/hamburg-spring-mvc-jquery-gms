package com.example.demo.sec.service;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Service;

@Service
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		// IP, 세션 ID
		WebAuthenticationDetails web = (WebAuthenticationDetails) authentication.getDetails();
		System.out.println("IP : " + web.getRemoteAddress());
		System.out.println("Session ID : " + web.getSessionId());
		
		// 인증 ID
		System.out.println("name : " + authentication.getName());
		
		// 권한 리스트
		List<GrantedAuthority> authList = (List<GrantedAuthority>) authentication.getAuthorities();
		System.out.print("권한 : ");
		for(int i = 0; i< authList.size(); i++) {
			System.out.print(authList.get(i).getAuthority() + " ");
		}
		System.out.println();
		
		/////////////////
		
		// Security가 요청을 가로챈 경우 사용자가 원래 요청했던 URI 정보를 저장한 객체
				RequestCache requestCache = new HttpSessionRequestCache();
				SavedRequest savedRequest = requestCache.getRequest(request, response);
				String uri = "";
				// 있을 경우 URI 등 정보를 가져와서 사용
				if (savedRequest != null) {
					uri = savedRequest.getRedirectUrl();
					
					// 세션에 저장된 객체를 다 사용한 뒤에는 지워줘서 메모리 누수 방지
					requestCache.removeRequest(request, response);

					System.out.println(uri);
				}

				// 세션 Attribute 확인
				Enumeration<String> list = request.getSession().getAttributeNames();
				while (list.hasMoreElements()) {
					System.out.println(list.nextElement());
				}

				response.sendRedirect(uri);
				
				//////////// 시큐리티 저장 예제  ////////
				
				SavedRequest save = (SavedRequest) request.getSession()
						.getAttribute("SPRING_SECURITY_SAVED_REQUEST");
				if (save != null) {
					uri = save.getRedirectUrl();
					System.out.println(uri);
				}
		
	}
}
