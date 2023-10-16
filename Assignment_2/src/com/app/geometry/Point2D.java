package com.app.geometry;

import java.util.Scanner;
import java.lang.Math;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	public boolean isEqual(Point2D other) {
		if (other == null) {
			return false;
		}
		return x == other.x && y == other.y;
	}

	public double calculateDistance(Point2D other) {
		double dx = x - other.x;
		double dy = y - other.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

	public static class TestPoint {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter x and y coordinates for point 1: ");
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();

			System.out.println("Enter x and y coordinates for point 2: ");
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();

			Point2D p1 = new Point2D(x1, y1);
			Point2D p2 = new Point2D(x2, y2);

			System.out.println("Point 1 details: " + p1.getDetails());
			System.out.println("Point 2 details: " + p2.getDetails());

			if (p1.isEqual(p2)) {
				System.out.println("Points are the same.");
			} else {
				System.out.println("Points are different.");
			double distance = p1.calculateDistance(p2);
			System.out.println("Distance between point 1 and point 2 is " + distance);
			}

		}
	}
}
