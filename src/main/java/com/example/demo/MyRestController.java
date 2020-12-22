package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/hello") 
	public Map<?,?> hello(){ 
		var map = new HashMap<>();
		System.out.println("------------- REST TEST -----------");
		map.put("message", "SUCCESS");
		return map; 
	}
}
