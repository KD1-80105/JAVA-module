package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

class TreeComparator implements Comparator<NaturalTreeset> {

	public int compare(NaturalTreeset arg0, NaturalTreeset arg1) {
		int diff = -Double.compare(arg0.getPrice(), arg1.getPrice());
		return diff;
	}

}

public class NaturalTreeset {

	private String isbn;
	private double price;
	private String authorname;

	public String getIsbn() {
		return isbn;
	}

	public NaturalTreeset() {

	}

	public NaturalTreeset(String isbn, String authorname, double price) {

		this.isbn = isbn;
		this.price = price;
		this.authorname = authorname;

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

	@Override
	public String toString() {
		return "NaturalTreeset [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname+"]";

	}


	public static void main(String[] args) {

		TreeComparator tcmp = new TreeComparator();
		TreeSet<NaturalTreeset> list = new TreeSet<>(tcmp);

		/*
		
		
		
		
		*/

		NaturalTreeset b1 = new NaturalTreeset("anshu", "wankhede", 5500);
		NaturalTreeset b2 = new NaturalTreeset("akhil", "varute", 6000);
		NaturalTreeset b3 = new NaturalTreeset("suyash", "more", 815);
		NaturalTreeset b4 = new NaturalTreeset("shekhar", "pawale", 564);
		NaturalTreeset b5 = new NaturalTreeset("akhil", "pitol", 586);

		Collections.addAll(list, b1, b2, b3, b4, b5);

		Iterator<NaturalTreeset> iterator = list.iterator();
		while (iterator.hasNext()) {
			NaturalTreeset e = iterator.next();
			System.out.println(e);
		}

		System.out.println("Iterator in Descending order");
//		NavigableSet<NaturalTreeset> revset = list.descendingSet();
//		System.out.println("Descending Set :" + revset);
		
		Iterator<NaturalTreeset> itr=list.descendingIterator();
		while (itr.hasNext()) {
			NaturalTreeset revset=itr.next();
			System.out.println(revset +",");
		}
		System.out.println();
	}

}
