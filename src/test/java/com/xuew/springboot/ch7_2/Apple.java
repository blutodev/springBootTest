package com.xuew.springboot.ch7_2;

public class Apple extends Fruit {
	public int weight = 20;
	
	public void method(){
		System.out.println("method in " + this.getClass());
	}
}
