package com.sunbeam;

class Box1<T> {
	private T obj;

	public void set(T val) {
		this.obj = val;
	}

	public T get() {
		return this.obj;
	}
}

public class Tester {

	public static void printDisplayableBox(Box1<? extends Displayable> b) {
		b.get().show();
	}

	public static void printbox(Box1<?> b) {
		System.out.println(b.get().toString());
	}
	
	public static void main(String[] args) {
		Box1<Person1> p1=new Box1<>();
		p1.set(new Person1());
		p1.get().accept();
		printDisplayableBox(p1) ;
		
		Box1<Date> p2=new Box1<>();
		p2.set(new Date());
		p1.get().accept();
		printDisplayableBox((Box1<? extends Displayable>) p2);
		
		printbox(p2);
		printbox(p1);
	}
}
