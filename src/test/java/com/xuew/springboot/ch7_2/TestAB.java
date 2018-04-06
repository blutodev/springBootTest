package com.xuew.springboot.ch7_2;

public class TestAB {

	public static void main(String[] args) {
		Fruit a = new Apple();
		System.out.println(a.weight);
		a.method();

		Plate<? extends Fruit> plate = new Plate<Apple>();
		plate.get();
		//Compile Error
		//plate.add(new Apple());
		
	}

}
