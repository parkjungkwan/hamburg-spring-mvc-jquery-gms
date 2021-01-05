package com.example.demo.www.chap05;

import java.util.Arrays;
import java.util.List;

public class MyDish {

  private final String name;
  private final boolean vegetarian;
  private final int calories;
  private final Type type;

  public MyDish(String name, boolean vegetarian, int calories, Type type) {
    this.name = name;
    this.vegetarian = vegetarian;
    this.calories = calories;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public int getCalories() {
    return calories;
  }

  public Type getType() {
    return type;
  }

  public enum Type {
    MEAT,
    FISH,
    OTHER
  }

  @Override
  public String toString() {
    return name;
  }

  public static final List<MyDish> menu = Arrays.asList(
      new MyDish("pork", false, 800, MyDish.Type.MEAT),
      new MyDish("beef", false, 700, MyDish.Type.MEAT),
      new MyDish("chicken", false, 400, MyDish.Type.MEAT),
      new MyDish("french fries", true, 530, MyDish.Type.OTHER),
      new MyDish("rice", true, 350, MyDish.Type.OTHER),
      new MyDish("season fruit", true, 120, MyDish.Type.OTHER),
      new MyDish("pizza", true, 550, MyDish.Type.OTHER),
      new MyDish("prawns", false, 400, MyDish.Type.FISH),
      new MyDish("salmon", false, 450, MyDish.Type.FISH)
  );

}
