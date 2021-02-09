package com.example.demo.www;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.example.demo.dwh.domain.Util;

import lombok.AllArgsConstructor;
import lombok.Data;



public class StreamService{
	
	
	public List<String> bookTitle(){
		return Arrays.asList("Java8", "Lambdas", "In", "Action");
	}
	public List<Dish> menu(){
		return Arrays.asList(
			      new Dish("pork", false, 800, Type.MEAT),
			      new Dish("beef", false, 700, Type.MEAT),
			      new Dish("chicken", false, 400, Type.MEAT),
			      new Dish("french fries", true, 530, Type.OTHER),
			      new Dish("rice", true, 350, Type.OTHER),
			      new Dish("season fruit", true, 120, Type.OTHER),
			      new Dish("pizza", true, 550, Type.OTHER),
			      new Dish("prawns", false, 400, Type.FISH),
			      new Dish("salmon", false, 450, Type.FISH));
	}
	public List<Dish> filterByWeight(int weight) {
	    return menu().stream()
	        .filter(dish -> {
	          return dish.getCalories() > weight;
	        })
	        .map(dish -> {
	          return dish;
	        })
	        .collect(toList());
	    
	  }

	  public List<String> getLowCaloricDishesNames(List<Dish> dishes) {
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
