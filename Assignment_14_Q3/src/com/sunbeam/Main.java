package com.sunbeam;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static int menu() {
		int choice = 0;
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Dibision");
		System.out.println("..Enter your choice ..");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		int choice = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				calculate(2, 5, (x, y) -> x + y);
				break;
			case 2:
				calculate(2, 5, (x, y) -> x - y);

				break;
			case 3:
				calculate(2, 5, (x, y) -> x * y);

				break;
			case 4:
				calculate(2, 5, (x, y) -> x / y);

				break;

			default:
				System.out.println("Wrong Choice !!");
				break;
			}
		}
	}
}
