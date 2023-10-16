package com.app.fruits;

import java.util.Scanner;

public class Fruit {

	String color;
	double weight;
	String name;
	boolean isFresh;

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the name of the fruit :");
//		name = sc.next();
		System.out.println("enter the weight of the fruits :");
		weight = sc.nextDouble();
		System.out.println("enter the color of the fruit :");
		color = sc.next();
		this.isFresh=false;
		
	}

	public void displayData() {
		System.out.println("enter the name of the fruit :" + name);
		System.out.println("enter the weight of the fruits :" + weight);
		System.out.println("enter the color of the fruit :" + color);
	}

	public boolean isFresh() {
		if (isFresh) {
			return false;
		} else {
			return true;
		}
	}

	
public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getFresh() {
		return false;
		
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";
	}

}
