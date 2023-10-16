import java.util.Scanner;

public class ASS1_Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity;
        int totalAmount = 0;
        int choice = -1; 
        double sum=0;

        while (choice != 0) {
            System.out.println("************************");
            System.out.println("0.Exit");
            System.out.println("1.Dosa");
            System.out.println("2.Samosa");
            System.out.println("3.Idli");
			System.out.println("4.Utappa");
			System.out.println("5.Medu wada");
			System.out.println("6.ASS-cream");
			System.out.println("7.vada pav");
			System.out.println("8.bhelpuri");
			System.out.println("9.burgirr");
			System.out.println("10.pizza");
            System.out.println("************************");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
            case 0:
    			
    			break;
			case 1:
				
				System.out.println("Enter the number of Dosa's your stomach can digest");
				System.out.println("enter the quantity :");
				quantity = sc.nextInt();
				totalAmount=(quantity*50);
				sum=sum+totalAmount;
				System.out.println("your total bill is :"+totalAmount);

			break;
		case 2:	
			
			System.out.println("Enter the number of 's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*30);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);	
			break;
		case 3:	
			System.out.println("Enter the number of Idli's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*50);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
		case 4:	
			
			System.out.println("Enter the number of Utappa's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*70);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
		case 5:	
			
			System.out.println("Enter the number of Medu wada's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*40);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
		case 6:	
			
			System.out.println("Enter the number of ice cream's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*30);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
		case 7:	
			
			System.out.println("Enter the number of Wada pavs's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*60);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
		case 8:	
			
			System.out.println("Enter the number of bhelppuri's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*80);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
		case 9:	
				
			System.out.println("Enter the number of burgirr's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();	
			totalAmount=(quantity*60);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;

		case 10:	
			
			System.out.println("Enter the number of Pizza's your stomach can digest");
			System.out.println("enter the quantity :");
			quantity = sc.nextInt();
			totalAmount=(quantity*60);
			sum=sum+totalAmount;
			System.out.println("your total bill is :"+totalAmount);
			break;
			
			}
		
            System.out.println("your total bill is :"+sum);
         }
           
        
        
        System.out.println("Thank you visit again!!!!");

        sc.close();
    }
}

