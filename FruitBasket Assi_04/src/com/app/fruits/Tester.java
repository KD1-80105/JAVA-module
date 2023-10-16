package com.app.fruits;

import java.util.Scanner;

public class Tester {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice = 0;
		System.out.println("0.EXIT");
		System.out.println("1.ADD MANGO");
		System.out.println("2.ADD ORANGE");
		System.out.println("3.ADD APPLE");
		System.out.println("4.Display names of all fruits in the basket");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("8.Mark all sour fruits stale");
		System.out.println("enter your choice :");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		int choice = 0;
		int basketSize = 0;
		int counter = 0;
		System.out.println("enter the size of basket :");
		basketSize = sc.nextInt();
		Fruit[] basket = new Fruit[basketSize];
		while ((choice=menu())!= 0) {
			switch (choice ) {

			case 1:
				if (counter < basketSize) {

					basket[counter] = new Mango();
					basket[counter].acceptData();
					counter++;
//					basket[counter].displayData();
				}
				else {
					System.out.println("basket is full !!");
				}
				break;

			case 2:
				if (counter < basketSize) {
					
					basket[counter] = new Orange();
					basket[counter].acceptData();
					counter++;
					}
				else {
					System.out.println("basket is full !!");
				}

				break;

			case 3:
				if (counter < basketSize) {
					
					basket[counter] = new Apple();
					basket[counter].acceptData();
					counter++;
				}
				else {
					System.out.println("basket is full !!");
				}

				break;

			case 4:
				for (Fruit fruit : basket) {
					if (fruit!=null) {
						System.out.println("names of fruit in the basket :"+fruit.getName());
					}
					else {
						System.out.println("basket is full !!");
					}

				}
				break;

			case 5:
				for (Fruit fruit : basket) {
					if (fruit!=null) {
//						fruit.toString();
						fruit.taste();
						if (fruit.isFresh()) {
							System.out.println(fruit.getName()+" is fresh");
						} else {
							System.out.println(fruit.getName()+" is stale");
						}
					System.out.println("names of fruit in the basket :"+fruit.getWeight());
					}
				}
				break;

			case 6:

				for (Fruit fruit : basket) {
					if (fruit!=null) {
						if(!fruit.isFresh());
						System.out.println(fruit.taste());
						System.out.println("*************");
					}

				}
				break;

			case 7:
				System.out.println("enter the index :");
				int index=sc.nextInt();
				if (index>=0 && index<basketSize) {
					basket[index].setFresh(false);
				}
				break;

			case 8:
				 for (Fruit fruit : basket) {
					if (fruit!=null) {
					if (fruit.taste()=="sour taste") {
						fruit.setFresh(false);
					}
				}
			}
				break;
			case 0:
				break;

			default:
				break;
			}
		}
		System.out.println("thank you go awayyyyy!!!!!!!!!");
	}

}
