package com.example.demo.www.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.example.demo.cmm.utl.Util;

import lombok.Data;

@Data class Apple{
	private int weight; private Color color; 
	public Apple(int weight, Color color){this.weight = weight;this.color = color; }
	
}
enum Color { RED, GREEN }
/*
class AppleWeightPredicate implements Predicate<Apple>{

	@Override
	public boolean test(Apple t) {
		
		return false;
	}
	
}
class AppleColorPredicate implements Predicate<Apple>{

	@Override
	public boolean test(Apple t) {
		
		return false;
	}
	
}
class AppleRedAndHeavyPredicate implements Predicate<Apple>{

	@Override
	public boolean test(Apple t) {
		return false;
	}
	
}
*/
class AppleService {
	 List<Apple> filterApples(List<Apple> ls, Predicate<Apple> p){
		List<Apple> r = new ArrayList<>();
		for(Apple a: ls) {
			if(p.test(a)) {
				r.add(a);
			}
		}
		return r;
	}
	 public List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		    List<Apple> result = new ArrayList<>();
		    for (Apple apple : inventory) {
		      if (apple.getColor() == color) {
		        result.add(apple);
		      }
		    }
		    return result;
		  }

	 public List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
	    List<Apple> result = new ArrayList<>();
	    for (Apple apple : inventory) {
	      if (apple.getWeight() > weight) {
	        result.add(apple);
	      }
	    }
	    return result;
	 }
	boolean isHeavyApple(Apple apple) {return apple.getWeight() >= 100;}
	boolean isGreenApple(Apple apple) {return Color.GREEN.equals(apple.getColor());}
	
}
public class AppleController extends Util{	
	public static void main(String... args) {
		AppleService as = new AppleService();
		List<Apple> ls = Arrays.asList(
				new Apple[]{new Apple(80, Color.GREEN),
						new Apple(90, Color.GREEN),
						new Apple(100, Color.RED),
						new Apple(110, Color.RED),
						new Apple(120, Color.RED)});
		print("녹색사과 필터링 결과");
		for(Apple a : as.filterApples(ls, as::isGreenApple)) print(a.toString());
		print("빨간사과 필터링 결과 ... 단, 색깔은 외부주입");
		for(Apple a : as.filterApplesByColor(ls, Color.RED)) print(a.toString());
		print("100그램이상 사과 필터링 결과");
		for(Apple a : as.filterApples(ls, as::isHeavyApple)) print(a.toString());
		print("120그램이상 사과 필터링 결과 ... 단, 무게는 외부주입");
		for(Apple a : as.filterApplesByWeight(ls, 120)) print(a.toString());
		
	}		
}
	



