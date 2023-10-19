package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookHashmap {
	static Scanner sc = new Scanner(System.in);
	private String isbn;
	private double price;

	public BookHashmap() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + " " + "price=" + price + "]";

	}

	public void acceptData() {
		System.out.println("Enter the Book name :");
		isbn = sc.next();
		System.out.println("Enter the price of the Book");
		setPrice(sc.nextDouble());

	}

	public static int menu() {
		int choice = 0;
		System.out.println("1. insert in map :");
		System.out.println("2. find in map");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		Map<String, BookHashmap> list = new HashMap<>();
		int choice = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				BookHashmap b = new BookHashmap();
				b.acceptData();
				list.put(b.getIsbn(), b);
				break;
			case 2:
				String isbn = sc.next();
				BookHashmap f = list.get(isbn);
				System.out.println(f);
				break;

			default:
				break;
			}
		}

	}

}
