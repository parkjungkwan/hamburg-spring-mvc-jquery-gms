package com.example.demo.cmm.utl;
import static com.example.demo.cmm.utl.Util.*;
import static java.util.stream.Collectors.*;
import java.util.ArrayList;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
리스트 형식의 추상화: Generic
커스텀 List<T> 를 제작하여 사용함
p.82 참조
메소드 목록 : https://www.javatpoint.com/java-arraylist
 * */
@Component("ls") @Lazy
public class Inventory<T> {
	private ArrayList<T> inventory;
	public Inventory() {inventory = new ArrayList<T>();}
	public void add(T t) {inventory.add(t);}
	public T get(int i) {return inventory.get(i);}
	public ArrayList<T> get(){return inventory;}
	public void clear() {inventory.clear();}
	public int size() {return inventory.size();}
}

