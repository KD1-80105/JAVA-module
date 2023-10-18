package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Book {
	static Scanner sc = new Scanner(System.in);

	private String isbn;
	private double price;
	private String authorname;
	private int quantity;

	public String getIsbn() {
		return isbn;
	}

	public Book() {

	}

	public Book(String isbn, double price, String authorname, int quantity) {

		this.isbn = isbn;
		this.price = price;
		this.authorname = authorname;
		this.quantity = quantity;
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

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorname, other.authorname) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}

	public void acceptData() {
		System.out.println("Enter the Book name :");
		isbn = sc.next();
		System.out.println("Enter the price of the Book");
		price = sc.nextDouble();
		System.out.println("Enter the name of the Author");
		authorname = sc.next();
		System.out.println("Enter gthe quantity of the books you wish");
		quantity = sc.nextInt();
	}

	public void displayData() {
		System.out.println("Book Name :" + isbn);
		System.out.println("Book Price :" + price);
		System.out.println("Author Name :" + authorname);
		System.out.println("Quantity of the Books :" + quantity);
	}

	public static int menu() {
		int choice = 0;
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn .");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list");
		System.out.println("   Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();

		int choice = 0;
		do {

			switch (choice) {

			case 1:
				Book b = new Book();
				b.acceptData();
				int idx = 0;
				if (list.contains(b)) {
					idx = list.indexOf(b);
					b = list.get(idx);
					b.setQuantity(b.getQuantity() + 1);
				}
				list.add(b);

				break;
			case 2:
				for (Book ele : list) {
					System.out.println(ele);
				}

				break;
			case 3:
				Book b1 = new Book();
				
				System.out.println("Enter the name of the book you wish to find :");
				String str = sc.next();
				b1.setIsbn(str);
				if (list.contains(b1)) {
					int idx1 = list.indexOf(b1);
					list.get(idx1).toString();
					
				} 
				break;
			case 4:
				System.out.println("Enter the index :");
				int index1 = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (index1 == i)
						list.remove(i);
				}
				break;
			case 5:
				System.out.println("Enter the isbn you wish to find :");
				String str1 = sc.next();
				boolean bookDeleted = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getIsbn().equals(str1)) {
						list.remove(i);
						bookDeleted = true;
					}
				}
				System.out.println("Book Deleted");

				break;
			case 6:
				Collections.reverse(list);

			default:
				System.out.println("Wrong Choice!!!!!!");
				break;
			}
		} while ((choice = menu()) != 0);
	}
}