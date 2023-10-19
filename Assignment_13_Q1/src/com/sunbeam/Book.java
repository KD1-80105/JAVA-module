package com.sunbeam;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


public class Book {

	private String isbn;

	private String authorname;

	public String getIsbn() {
		return isbn;
	}

	public Book() {

	}

	public Book(String isbn, String authorname) {

		this.isbn = isbn;

		this.authorname = authorname;

	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + " " + "authorname=" + authorname;

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
		return Objects.equals(authorname, other.authorname) && Objects.equals(isbn, other.isbn);

	}

	public static void main(String[] args) {

		HashSet<Book> list = new HashSet<>();

		Book b1 = new Book("anshu", "akhil");
		Book b2 = new Book("akhil", "varute");
		Book b3 = new Book("suyash", "more");
		Book b4 = new Book("shekhar", "pawale");
		Book b5 = new Book("pavan", "pitol");

		Collections.addAll(list, b1, b2, b3, b4, b5);

		Iterator<Book> iterator = list.iterator();
		while (iterator.hasNext()) {
			Book e = iterator.next();
			System.out.println(e);
		}

	}
}
