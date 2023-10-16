package com.app.fruits;

public class Apple extends Fruit {
	public Apple() {
		this("",0.0,false);
	}

	public Apple(String color, double weight, boolean isFresh) {
		super(color, weight, "apple", isFresh);

	}

	@Override
	public void acceptData() {
		System.out.println("enter the details for apples :");
		super.acceptData();
		
	}

	public String taste() {
		return "Sweet n sour";

	}
}
