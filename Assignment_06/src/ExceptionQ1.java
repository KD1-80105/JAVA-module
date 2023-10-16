
import java.util.Scanner;

public class ExceptionQ1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String name = scanner.nextLine();

     try {
         checkStringLength(name);
         System.out.println("The string length is in the limit.");
     } catch (ExceptionLineTooLong e) {
         System.err.println("Error: " + e.getMessage());
         e.printStackTrace();
     }
 }

 
 private static void checkStringLength(String input) throws ExceptionLineTooLong {
     if (input.length() > 80) {
         throw new ExceptionLineTooLong();
         
     }
 }
}
