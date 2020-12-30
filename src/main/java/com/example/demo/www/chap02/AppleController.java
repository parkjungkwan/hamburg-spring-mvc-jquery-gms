package com.example.demo.www.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lombok.Data;

@Data class Apple{
	private int weight; private Color color; 
	public Apple(int weight, Color color){this.weight = weight;this.color = color; }
	
}
enum Color { RED, GREEN }
// @FunctionalInterface interface Predicate<T> {public boolean test(T t);} // p.101

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

class AppleFilter{
	public List<Apple> filterGreenApples(List<Apple> inventory) {
	    List<Apple> result = new ArrayList<>();
	    for (Apple apple : inventory) {
	      if (apple.getColor() == Color.GREEN) {
	        result.add(apple);
	      }
	    }
	    return result;
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
/*
	  public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
	    List<Apple> result = new ArrayList<>();
	    for (Apple apple : inventory) {
	      if (p.test(apple)) {
	        result.add(apple);
	      }
	    }
	    return result;
	  } */
}
// @FunctionalInterface interface FilterApples{ public List<Apple> apply(List<Apple> ls, Predicate<Apple> pre);}

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
	boolean isHeavyApple(Apple apple) {return apple.getWeight() > 150;}
	boolean isGreenApple(Apple apple) {return Color.GREEN.equals(apple.getColor());}
	
}
public class AppleController{	
	public static void main(String... args) {
		AppleService as = new AppleService();
		
		//Predicate<Apple> p = (Apple t) -> {return false;};
		
		// {new Apple(80, Color.GREEN), new Apple(90, Color.RED)}
		List<Apple> ls = Arrays.asList(
				new Apple[]{new Apple(80, Color.GREEN),
						new Apple(100, Color.GREEN),
						new Apple(120, Color.RED)});
		as.filterApples(ls, as::isGreenApple);
		as.filterApples(ls, as::isHeavyApple);
		
	}		
		
}
	



