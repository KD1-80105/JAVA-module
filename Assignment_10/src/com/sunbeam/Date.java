package com.sunbeam;

import java.util.Scanner;

class Date implements Displayable{
		Scanner sc = new Scanner(System.in);

		int day, month ,year;
		
		
		private void accept() {
			System.out.println("Enter the day :");
			day=sc.nextInt();
			System.out.println("Enter the month :");
			month=sc.nextInt();
			System.out.println("Enter the year :");
			year=sc.nextInt();

		}
		public void show() {
			System.out.println("enter the day month and the year :"+day+"/"+month+"/"+year);
		}
		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
		
	}
