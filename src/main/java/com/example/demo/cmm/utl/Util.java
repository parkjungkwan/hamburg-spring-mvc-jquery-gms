package com.example.demo.cmm.utl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component
public class Util {
	
	public static Function<Object, String> string = String :: valueOf;
	public static Function<String, Integer> integer = Integer :: valueOf;
	public static BiPredicate<String, String> equals = String :: equals;
	public static BiFunction<Integer, Integer, Integer> rangeRandom =(t,u)->(int)(Math.random()*(u-t))+t;
	public static Function<Integer, int[]> intArr = int[] :: new;
	public static Supplier<String> today = () -> new SimpleDateFormat("yyyy-MM-dd").format(new Date());
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
	public static BiFunction<Integer, Integer, String> f = (a, b) -> String.valueOf((int)(Math.random() * (b-a)) + a);
	
}
