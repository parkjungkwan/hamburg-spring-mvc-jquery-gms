package com.example.demo.cmm.utl;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

@Component
public class Util {
	public static void print(String s) {
		Consumer<String> c = System.out :: println;
		c.accept(s);
	}
}
