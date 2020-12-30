package com.example.demo.www.chap04;

import static com.example.demo.zzz.chap04.Dish.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.example.demo.cmm.utl.Util;


import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamController extends Util{
	public static void main(String... args) {
		 List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
		 Stream<String> s = names.stream();
		 s.forEach(System.out::println);
		 // 스트림은 한 번 만 소비할 수 있으므로 아래 행의 주석을 제거하면 IllegalStateException이 발생
		 //s.forEach(System.out::println);
		 List<Dish> menu = Arrays.asList(
			      new Dish("pork", false, 800, Type.MEAT),
			      new Dish("beef", false, 700, Type.MEAT),
			      new Dish("chicken", false, 400, Type.MEAT),
			      new Dish("french fries", true, 530, Type.OTHER),
			      new Dish("rice", true, 350, Type.OTHER),
			      new Dish("season fruit", true, 120, Type.OTHER),
			      new Dish("pizza", true, 550, Type.OTHER),
			      new Dish("prawns", false, 400, Type.FISH),
			      new Dish("salmon", false, 450, Type.FISH)
		);
		
	}
}

class StreamService{
	public void filter() {
	    List<String> names = menu.stream()
	        .filter(dish -> {
	          System.out.println("filtering " + dish.getName());
	          return dish.getCalories() > 300;
	        })
	        .map(dish -> {
	          System.out.println("mapping " + dish.getName());
	          return dish.getName();
	        })
	        .limit(3)
	        .collect(toList());
	    System.out.println(names);
	  }
	public List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
	    List<Dish> lowCaloricDishes = new ArrayList<>();
	    for (Dish d : dishes) {
	      if (d.getCalories() < 400) {
	        lowCaloricDishes.add(d);
	      }
	    }
	    List<String> lowCaloricDishesName = new ArrayList<>();
	    Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
	      @Override
	      public int compare(Dish d1, Dish d2) {
	        return Integer.compare(d1.getCalories(), d2.getCalories());
	      }
	    });
	    for (Dish d : lowCaloricDishes) {
	      lowCaloricDishesName.add(d.getName());
	    }
	    return lowCaloricDishesName;
	  }

	  public List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
	    return dishes.stream()
	        .filter(d -> d.getCalories() < 400)
	        .sorted(comparing(Dish::getCalories))
	        .map(Dish::getName)
	        .collect(toList());
	  }

}
@Data @AllArgsConstructor class Dish{ 
	private String name; boolean vegetarian; int calories; Type type;
}
enum Type {  MEAT, FISH, OTHER }
