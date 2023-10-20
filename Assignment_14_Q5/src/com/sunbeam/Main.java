package com.sunbeam;

import java.util.Scanner;

import com.sunbeam.CountifDouble.Check;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T t : arr) {
			if (c.compare(t, key)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Integer[] arr = { 44, 77, 99, 22, 55, 66 };
		Double[] arr1 = { 22.2, 44.5, 88.6, 88.3, 22.9, 49.9 };
		Integer key = 50;
		System.out.println("Enter the key :");
		double dkey = sc.nextDouble();
		int cnt = countIf(arr, key, (x, y) -> x > y);
		double cnt1 = countIf(arr1, dkey, (x, y) -> x.equals(y));
		System.out.println("Count = " + cnt +" and "+cnt1);
	}

}
