package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
	static Scanner sc = new Scanner(System.in);

	private int roll_no;
	private String name;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}

	public void acceptData() {
		System.out.println("Enter the Student name :");
		setName(sc.next());
		System.out.println("Enter the Roll bo of the student :");
		roll_no = sc.nextInt();

	}

	public static int menu() {
		int choice = 0;
		System.out.println("1. Add new Student :");
		System.out.println("2. find in student");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<>();
		int choice = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Student b = new Student();
				b.acceptData();
				map.put(b.getRoll_no(), b);
				break;
			case 2:
				System.out.println("Enter the Roll no of the Srudent you wish to find :");
				int roll = sc.nextInt();
				Student s = map.get(roll);
				System.out.println(s);
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}
		}

	}

}
