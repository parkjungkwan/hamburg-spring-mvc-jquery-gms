package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.utl.Box;

@RestController
public class MyRestController {
	@Autowired Box<String> bx;
	@GetMapping("/hello") 
	public Map<?,?> hello(){ 
		bx.put("message", "SUCCESS");
		return bx.get(); 
	}
}
