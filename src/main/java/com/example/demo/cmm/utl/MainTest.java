package com.example.demo.cmm.utl;

import com.example.demo.www.chap05.MappingService;

public class MainTest{
	public static void main(String[] args) {
		System.out.println("-------");
		DummyGenerator bs = new DummyGenerator();
		System.out.println(bs.makeUserid());
	}
}