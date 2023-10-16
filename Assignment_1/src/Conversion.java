import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your number :");
		int num=scanner.nextInt();
		System.out.println("Welcome to the conversion program!!!");
		
		 
		System.out.println("you have entered :"+num);
		System.out.println("binary equivalent number of you number is :"+Integer.toBinaryString(num));
		System.out.println("Octal equivalent number of you number is :"+Integer.toOctalString(num));
		System.out.println("Hexal equivalent number of you number is :"+Integer.toHexString(num));
		
        scanner.close();


	}

}
