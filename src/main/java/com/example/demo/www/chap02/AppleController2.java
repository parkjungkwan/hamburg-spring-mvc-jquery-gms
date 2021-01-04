package com.example.demo.www.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.toList;
import lombok.Data;

public class AppleController2{	
	public static void main(String... args) {
		List<Apple> ls = Arrays.asList(
				new Apple[]{new Apple(80, Color.GREEN),
						new Apple(90, Color.GREEN),
						new Apple(100, Color.RED),
						new Apple(110, Color.RED),
						new Apple(120, Color.RED)});
	
		
		ls.stream()
		.map(Apple::toString)
		.limit(3)
		.collect(toList()).forEach(System.out::println);
		
		
		
		

		
		
		//Stream<String> s = ls2.stream();
		//s.forEach(System.out::print);
	}		
}


	



