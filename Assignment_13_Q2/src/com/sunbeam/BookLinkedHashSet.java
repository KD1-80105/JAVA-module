package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class BookLinkedHashSet {

	private String isbn;

	private String authorname;

	public String getIsbn() {
		return isbn;
	}

	public BookLinkedHashSet() {

	}

	public BookLinkedHashSet(String isbn, String authorname) {

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
		return "Book :" + isbn + " " + authorname;

	}

	@Override
	public int hashCode() {
		return Objects.hash(authorname, isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookLinkedHashSet other = (BookLinkedHashSet) obj;
		return Objects.equals(authorname, other.authorname) && Objects.equals(isbn, other.isbn);
	}

	public static void main(String[] args) {

		LinkedHashSet<BookLinkedHashSet> list = new LinkedHashSet<>();

		/*
		
		
		
		
		*/

		BookLinkedHashSet b1 = new BookLinkedHashSet("anshu", "akhil");
		BookLinkedHashSet b2 = new BookLinkedHashSet("akhil", "varute");
		BookLinkedHashSet b3 = new BookLinkedHashSet("suyash", "more");
		BookLinkedHashSet b4 = new BookLinkedHashSet("shekhar", "pawale");
		BookLinkedHashSet b5 = new BookLinkedHashSet("pavan", "patil");

		Collections.addAll(list, b1, b2, b3, b4, b5);

		Iterator<BookLinkedHashSet> iterator = list.iterator();
		while (iterator.hasNext()) {
			BookLinkedHashSet e = iterator.next();
			System.out.println(e);
		}

	}

}
