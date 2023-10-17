package com.sunbeam;

import java.util.Comparator;

class DoubleComparator implements Comparator<Double> {

	@Override
	public int compare(Double arg0, Double arg1) {
		int diff = Double.compare(arg0.doubleValue(), arg1.doubleValue());
		return diff;
	}

}

public class Genarray2 {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {

		Double[] arr = new Double[5];
		arr[0] = new Double(22.2);
		arr[1] = new Double(32.2);
		arr[2] = new Double(98);
		arr[3] = new Double(2.2);
		arr[4] = new Double(69);

		System.out.println("before Sort");
		for (Double ele : arr) {
			System.out.println(ele);
		}

		DoubleComparator drr = new DoubleComparator();
		selectionSort(arr, drr);

		System.out.println("After Sort");
		for (Double ele1 : arr) {
			System.out.println(ele1);
		}

	}
}
