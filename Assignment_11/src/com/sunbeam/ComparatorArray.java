package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Compare implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		int diff = -(arg0.getCity().compareTo(arg1.getCity()));
		if (diff == 0)
			diff = -(Double.compare(arg0.getMarks(), arg1.getMarks()));
		if (diff == 0)
			diff = arg0.getName().compareTo(arg1.getName());

		return -diff;
	}

}

public class ComparatorArray {

	public static void main(String[] args) {
		Student[] arr = new Student[10];

		arr[0] = new Student(1, "akhil", "ich", 69);
		arr[1] = new Student(2, "anshu", "Ramakonna", 33);
		arr[2] = new Student(3, "dhoni", "karad", 59);
		arr[3] = new Student(4, "soni", "malad", 49);
		arr[4] = new Student(5, "tony ", "kolhaour", 79);
		arr[5] = new Student(6, "shekhar", "mumbai", 69);
		arr[6] = new Student(7, "jataale", "nanded", 33);
		arr[7] = new Student(8, "yogesh", "pune", 59);
		arr[8] = new Student(9, "soni", "malad", 99);
		arr[9] = new Student(10, "jay", "yakubpur", 88);

		System.out.println("Before Sort");
		for (Student stud : arr) {
			System.out.println(stud);
		}

		Compare comparator = new Compare();
		Arrays.sort(arr, comparator);
		System.out.println("After sorting by name , city , marks :");
		for (Student stud1 : arr) {
			System.out.println(stud1);
		}
	}
}
