package tester;

import java.util.Scanner;

public class Drivingcost {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Total miles driven per day :");
		double total_miles =sc.nextDouble();
		
		System.out.println("Cost per gallon of gasoline :");
		double gallonCost=sc.nextDouble();
		
		System.out.println("Average miles per gallon :");
		double avgMiles=sc.nextDouble();
		
		System.out.println("Parking fees per day :");
		double pFees=sc.nextDouble();
		
		System.out.println("Tolls per day :");
		int tolls=sc.nextInt();
		
		
		double costpermile=gallonCost/avgMiles;
		double totalCost=total_miles*gallonCost+pFees+tolls;

		System.out.println("total cost per mile :"+costpermile);
		System.out.println("the total driving cost is :"+totalCost);

		

	}

}
