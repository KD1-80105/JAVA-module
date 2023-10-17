package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
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
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index -- list.remove(index)");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order -- list.sort()");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
//		list.add(new Book("Pursuit of Happiness", 500, "akhil", 4));
//		list.add(new Book("The 10X Rule", 700, "shekhar", 1));
//		list.add(new Book("48 Rules of Power", 100, "mark zuke", 2));
//		list.add(new Book("IKIGAI", 300, "Nolan", 6));
//		list.add(new Book("Marigold", 100, "pavan", 2));

//		for (Book ele : list) {
//			System.out.println(ele);

		int choice = 0;
		do {

			switch (choice) {

			case 1:
				Book b = new Book();
				b.acceptData();
				list.add(b);
				break;
			case 2:
				for (Book ele : list) {
					System.out.println(ele);
				}
				break;
			case 3:
				System.out.println("Enter the index :");
				int index = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (index == i)
						list.remove(i);
				}
				break;
			case 4:
				System.out.println("Enter the name of the book you wish to find :");
				String str = sc.next();
				Book key = new Book();
				key.setIsbn(str);
				for (int i = 0; i < list.size(); i++) {
					if (list.contains(key)) {
						System.out.println("Found");
					} else {
						System.out.println("Not Found");
					}
				}

				break;
			case 5:
				list.clear();

				break;
			case 6:
				System.out.println("total number of books are :" + list.size());

			case 7:
				class BookpriceComparator implements Comparator<Book> {
					public int compare(Book b1, Book b2) {
						int diff = -Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
				}
				BookpriceComparator bookpriceComparator = new BookpriceComparator();
				list.sort(bookpriceComparator);
				break;
			case 0:
				System.out.println("Wrong Choice !!!!!!");
				break;
			default:

				break;
			}
		} while ((choice = menu()) != 0);
	}
}
