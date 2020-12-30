package com.example.demo.cmm.utl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class Util {
	public static void print(String s) {
		Consumer<String> c = System.out :: println;
		c.accept(s);
	}
	public static String string(Object o) {
		Function<Object, String> f = String :: valueOf;
		return f.apply(o);
	}
	public static Integer integer(String o) {
		Function<String, Integer> f = Integer :: valueOf;
		return f.apply(o);
	}
	public static boolean equals(String p1, String p2) {
		BiPredicate<String, String> b = String :: equals;
		return b.test(p1, p2);
	}
	public static int random(int a, int b) {
		//  int r = (int)(Math.random() * 46) + 1; 1 ~ 45까지 랜덤수
		BiFunction<Integer, Integer, Integer> f =(t,u)->(int)(Math.random()*(u-t))+t;
		return f.apply(a, b);
	}
	public static int[] arr(int size) {
		Function<Integer, int[]> f = int[] :: new;
		return f.apply(size);
	}
	public static String date() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	public static String time() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
	}
	public static File dir(String t, String u) {
		BiFunction<String,String, File> f = File::new;
		return f.apply(t, u);
	}
	public static File file(File t, String u) {
		BiFunction<File,String, File> f = File::new;
		return f.apply(t, u);
	}
	
}
