package com.sunbeam;

import java.util.function.Predicate;

public class Numcount {

	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		Predicate<String> cond = (String str) -> str.length() > 6;	
		int count = countIf(arr, cond);
		System.out.println(count); 		
	}

}
