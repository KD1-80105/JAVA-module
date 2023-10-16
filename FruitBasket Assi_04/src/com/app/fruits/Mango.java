package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color, double weight, boolean isFresh) {
		super(color, weight,"Mango", isFresh);
	}

	public Mango() {
		this("",0.0,false);
	}

	
	@Override
	public void acceptData() {
		System.out.println("enter the details for mango :");
		super.acceptData();
		
	}

	public String taste() {
		return "sweet";
	}
}
