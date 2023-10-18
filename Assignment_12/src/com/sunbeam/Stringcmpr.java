package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


	class StringComparator implements Comparator<String> {

		@Override
		public int compare(String arg0, String arg1) {
			int diff = arg0.length() - arg1.length();

			return diff;
		}

	}

	public class Stringcmpr {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "Akhil", "Akhil", "hil", "hil", "il", "il");
		String s = Collections.max(list,new StringComparator() );
		System.out.println("the max String is :" + s);

	}
}
