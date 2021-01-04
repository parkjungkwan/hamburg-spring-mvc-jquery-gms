package com.example.demo.www.chap05;

import static java.util.stream.Collectors.toList;
import static com.example.demo.zzz.chap04.Dish.menu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.zzz.chap04.Dish;

public class FilteringService {

  public List<Dish> filterByVegetarian() {
    // 프레디케이트로 거름
    
    return menu.stream()
        .filter(Dish::isVegetarian)
        .collect(toList());
  }
  public List<Integer> filterByOddNumber(){
	  // 고유 요소로 거름
	    return Arrays.asList(1, 2, 1, 3, 3, 2, 4).stream()
	        .filter(i -> i % 2 == 0)
	        .distinct().collect(Collectors.toList())
	       ;
  }
  public List<Dish> filterByCalories(){
	// 스트림 슬라이스
	    // 칼로리 값을 기준으로 리스트를 오름차순 정렬!
	    return Arrays.asList(
	        new Dish("season fruit", true, 120, Dish.Type.OTHER),
	        new Dish("prawns", false, 300, Dish.Type.FISH),
	        new Dish("rice", true, 350, Dish.Type.OTHER),
	        new Dish("chicken", false, 400, Dish.Type.MEAT),
	        new Dish("french fries", true, 530, Dish.Type.OTHER))
	    		.stream()
	    		.filter(dish -> dish.getCalories() < 320)
	    		.collect(toList());
	  
  }
  public List<Dish> myTakeWhile(){
	  System.out.println("Sorted menu sliced with takeWhile():");
	    return Arrays.asList(
		        new Dish("season fruit", true, 120, Dish.Type.OTHER),
		        new Dish("prawns", false, 300, Dish.Type.FISH),
		        new Dish("rice", true, 350, Dish.Type.OTHER),
		        new Dish("chicken", false, 400, Dish.Type.MEAT),
		        new Dish("french fries", true, 530, Dish.Type.OTHER))
		    		.stream()
	        .takeWhile(dish -> dish.getCalories() < 320)
	        .collect(toList());
	    
  }
  public List<Dish> myDropWhile(){
	  System.out.println("Sorted menu sliced with dropWhile():");
	    return Arrays.asList(
		        new Dish("season fruit", true, 120, Dish.Type.OTHER),
		        new Dish("prawns", false, 300, Dish.Type.FISH),
		        new Dish("rice", true, 350, Dish.Type.OTHER),
		        new Dish("chicken", false, 400, Dish.Type.MEAT),
		        new Dish("french fries", true, 530, Dish.Type.OTHER))
		    		.stream()
	        .dropWhile(dish -> dish.getCalories() < 320)
	        .collect(toList());
  }
  
  public List<Dish> mySkip(){
	  // 요소 생략
	    return Arrays.asList(
		        new Dish("season fruit", true, 120, Dish.Type.OTHER),
		        new Dish("prawns", false, 300, Dish.Type.FISH),
		        new Dish("rice", true, 350, Dish.Type.OTHER),
		        new Dish("chicken", false, 400, Dish.Type.MEAT),
		        new Dish("french fries", true, 530, Dish.Type.OTHER))
		    		.stream()
	        .filter(d -> d.getCalories() > 300)
	        .skip(2)
	        .collect(toList());

   

  }

}
