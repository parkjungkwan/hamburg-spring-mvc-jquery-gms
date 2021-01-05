package com.example.demo.www.chap05;

import static java.util.stream.Collectors.toList;


import java.util.Arrays;
import java.util.List;


public class MappingService{

   public List<String> myMap(){
    return MyDish.menu.stream()
        .map(MyDish::getName)
        .collect(toList());
   }
    public List<Integer> myMap2(){
    	return Arrays.asList("Hello", "World").stream()
    	        .map(String::length)
    	        .collect(toList());
    }
    public List<String> myFlatMap(){
    	return Arrays.asList("Hello", "World").stream()
    	        .flatMap((String line) -> Arrays.stream(line.split("")))
    	        .distinct().collect(toList());
    }
    public List<int[]> myFlatMap2(){
    	List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(6,7,8);
        return numbers1.stream()
            .flatMap((Integer i) -> numbers2.stream()
                .map((Integer j) -> new int[]{i, j})
            )
            .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
            .collect(toList());
    }

}
