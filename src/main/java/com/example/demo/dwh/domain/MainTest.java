package com.example.demo.dwh.domain;

import com.example.demo.www.MappingService;

public class MainTest{
	public static void main(String[] args) {
		System.out.println("-------");
		DummyGenerator bs = new DummyGenerator();
		System.out.println(bs.makeUserid());
	}
}