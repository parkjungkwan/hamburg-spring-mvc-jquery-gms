package com.example.demo.www.chap02;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data class Apple{private int weight; private Color color; }
enum Color { RED, GREEN }
@FunctionalInterface interface Predicate<T> {boolean test(T t);} // p.101

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

class FilteringApples {
	
	public static void main(String... args) {
		Apple a = new Apple();
	}

}

