package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class BookTreeSet implements Comparable<BookTreeSet> {

	private String isbn;

	private String authorname;

	public String getIsbn() {
		return isbn;
	}

	public BookTreeSet() {

	}

	public BookTreeSet(String isbn, String authorname) {

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
		BookTreeSet other = (BookTreeSet) obj;
		return Objects.equals(authorname, other.authorname) && Objects.equals(isbn, other.isbn);
	}

	public int compareTo(BookTreeSet obj) {
		int diff = this.isbn.compareTo(obj.isbn);
		return diff;
	}

//	class treeComparator implements Comparator<BookTreeSet> {
//
//		@Override
//		public int compare(BookTreeSet arg0, BookTreeSet arg1) {
//			int diff = arg0.getIsbn().compareTo(arg1.getIsbn());
//			return diff;
//		}
//
//	}
//	
//	treeComparator tcmp =new treeComparator();
//	

	public static void main(String[] args) {

		TreeSet<BookTreeSet> list = new TreeSet<>();

		/*
		
		
		
		
		*/

		BookTreeSet b1 = new BookTreeSet("anshu", "akhil");
		BookTreeSet b2 = new BookTreeSet("akhil", "varute");
		BookTreeSet b3 = new BookTreeSet("suyash", "more");
		BookTreeSet b4 = new BookTreeSet("shekhar", "pawale");
		BookTreeSet b5 = new BookTreeSet("akhil", "pitol");

		Collections.addAll(list, b1, b2, b3, b4, b5);

		Iterator<BookTreeSet> iterator = list.iterator();
		while (iterator.hasNext()) {
			BookTreeSet e = iterator.next();
			System.out.println(e);
		}

	}

}
