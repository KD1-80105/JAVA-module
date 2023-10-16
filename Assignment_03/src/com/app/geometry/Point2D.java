package com.app.geometry;

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
		

	}



