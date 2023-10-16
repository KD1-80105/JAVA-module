package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, double weight, boolean isFresh) {
		super(color, weight,"Orange", isFresh);

	}

	public Orange() {
		this("",0.0,false);
	}

	
	@Override
	public void acceptData() {
		System.out.println("enter the details for oranges :");
		super.acceptData();
		
	}

	public String taste() {;
		return "sour";
	}
}
