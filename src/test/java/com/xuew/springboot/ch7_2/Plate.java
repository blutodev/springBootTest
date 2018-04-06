package com.xuew.springboot.ch7_2;

import java.util.ArrayList;
import java.util.List;

public class Plate<T>{

	private List<T> list= new ArrayList<T>();
	
	public Plate(){}
	
	public void add(T item){
		list.add(item);
	}
	
	public T get(){
		return list.get(0);
	}
}
