package com.sunbeam;

import java.util.*;

public class Person {
	Scanner sc = new Scanner(System.in);

	String name;
	int age;

	public void accept() {
		System.out.println("enter the emp name : ");
		name=sc.next();
		System.out.println("enter the emp age :");
		age=sc.nextInt();

	}

	public void display() {
		System.out.println("The name of the employee is :" + name);
		System.out.println("The age of the employee is :" + age);

	}

}

abstract class Employee extends Person {

	int id;
	double salary;

	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the employee ID :");
		id=sc.nextInt();
		System.out.println("Enter the employee salary :");
		salary=sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("the ID of Employee is :" + id);
		System.out.println("the salary of the employee is :" + salary);
	}

	abstract double calculateSalary();
}

class Manager extends Employee {

	double bonus;

	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the bonus to be given to the manager :");
		bonus = sc.nextDouble();

	}

	@Override
	public void display() {
		super.display();
		System.out.println("Manager bonus is :" + bonus);
	}

	@Override
	double calculateSalary() {
		return this.salary;

	}

}

class Salesman extends Employee {

	double commission;

	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the commission of the salesman :");
		commission = sc.nextDouble();

	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salesman commission is :" + commission);
	}

	@Override
	double calculateSalary() {
		double totalSalary = (commission + this.salary);
		return totalSalary;

	}

}

class Box<T extends Employee> {
	private T obj;

	public void set(T val) {
		this.obj = val;
	}

	public T get() {
		return this.obj;
	}

	public double getTotalSalry() {
		return obj.calculateSalary();

	}
}

class Main {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.accept();
		m.display();

		Box<Manager> m1 = new Box<>();
		m1.set(m);
		System.out.println("Total salray of the manager is :" + m1.getTotalSalry());

		Salesman s = new Salesman();
		s.accept();
		s.display();

		Box<Salesman> s1 = new Box<>();
		s1.set(s);
		System.out.println("Total salray of the manager is :" + s1.getTotalSalry());

	}
}

