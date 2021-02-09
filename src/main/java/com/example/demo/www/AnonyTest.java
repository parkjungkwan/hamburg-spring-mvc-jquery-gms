package com.example.demo.www;

import java.util.function.Consumer;

public class AnonyTest {
	public static void main(String... args) {
		// Classic Java
		Person p = new Person();
		System.out.println(p.returnName("홍길동"));
		IPerson ip = (String name) -> { return name;};
		Log log = (String msg) -> {
				Consumer<String> c = System.out::print;
				c.accept(msg);
			};
		log.print(ip.showName("유관순"));
		
	}
}
class Person{
	String name; 
	String returnName(String name) {return name;}
}
interface IPerson{ String showName(String name);}
interface Log{ void print(String msg);}
