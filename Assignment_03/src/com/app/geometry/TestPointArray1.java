package com.app.geometry;

import java.util.Scanner;


public class TestPointArray1 {

	public static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println(".........................");
		System.out.println("1.Dispalay the details of specific points");
		System.out.println("2.Display X,Y coordinates of all points");
		System.out.println("3.Calculate distance between two points");
		System.out.println("4.Exit");
		System.out.println("Select your choice");
		choice = sc.nextInt();
		System.out.println("...........................");

		return choice;
	}

	public static void main(String[] args) {

		int choice;
		System.out.println("enter the number of points to be plot :");
		int num = sc.nextInt();

		Point2D[] points = new Point2D[num];
		for (int i = 0; i < points.length; i++) {
			System.out.println("enter the x and y coordinates "+(i+1)+":");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			points[i] = new Point2D(x, y);

		}

		do {
			choice = menu();
			switch (choice) {
			case 1:
				System.out.println("enter the indexes of the points: ");
				int index = sc.nextInt();
				if (index >= 0 && index < num) {
					System.out.println("display details of the point " + index + ":" + points[index].getDetails());
				} else {
					System.out.println("Invalid Index.Please retry !!");

				}
				break;
			case 2:
				System.out.println("coordinates of all points:");
				for (int i = 0; i < num; i++) {
					System.out.println("points " + i + ":" + points[i].getDetails());
				}
				break;
			case 3:
				System.out.println("Enter the indices of start and end points :");
				int startIndex=sc.nextInt();
				int endIndex=sc.nextInt();
				if (startIndex>=0 && startIndex<num && endIndex>=0 && startIndex<num) {
					if (!points[startIndex].isEqual(points[endIndex])) {
						double distance=points[startIndex].calculateDistance(points[endIndex]);
						System.out.println("distance beetwee the point "+startIndex + "and the point " +endIndex+":"+distance);
					} else {
						System.out.println("points are located at the same points");
					}
				} else {
					System.out.println("invalid choice. please try again !!");
				}
				break;
			case 4: 
				
			default:
				break;
			}
		} while (choice != 4);

	}

}
