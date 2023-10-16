import java.util.Scanner;

public class ASS1_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=0.0;
		double num1=0.0;
		
		System.out.println("enter your first number :");
		if (sc.hasNextDouble()!=sc.hasNextInt()) {
			num=sc.nextDouble();
			System.out.println("this is a double value");
		
			System.out.println("enter another number :");
		if(sc.hasNextDouble()!=sc.hasNextInt()){
			num1=sc.nextDouble();
			System.out.println("this is also a double value");
		}else {
			System.out.println("please enter the double value , this is not a double value");
		}
		}
		else {
			System.out.println("please enter the double value , this is not a double value");
		}
		System.out.println("your entered number are :"+num+" and "+num1);
		double result= (num + num1 / 2);
		System.out.println("the average of the values is :"+result);
		
	
		

	}


}


