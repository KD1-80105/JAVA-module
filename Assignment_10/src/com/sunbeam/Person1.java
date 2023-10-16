package com.sunbeam;

import java.util.Scanner;

class Person1 implements Displayable {

	Scanner sc = new Scanner(System.in);

	String name;
	int age;

	public void accept() {
		System.out.println("enter the emp name : ");
		name = sc.next();
		System.out.println("enter the emp age :");
		age = sc.nextInt();

	}

	@Override
	public void show() {
		System.out.println("The name of the employee is :" + name);
		System.out.println("The age of the employee is :" + age);

	}

	@Override
	public String toString() {
		return "Person [sc=" + sc + ", name=" + name + ", age=" + age + "]";
	}
}
