package com.sunbeam;

public class Genarray {

	static <T extends Number> T findmin(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].doubleValue() < arr[0].doubleValue()) {
				arr[0] = arr[i];
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		System.out.println("Min Integer:"+Genarray.findmin(arr1));
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		System.out.println("Min Integer:"+Genarray.findmin(arr2));

	}

}
