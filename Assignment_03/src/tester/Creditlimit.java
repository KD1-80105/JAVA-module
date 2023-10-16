package tester;

import java.util.Scanner;

public class Creditlimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter beginning balance: ");
        int beginningBalance = scanner.nextInt();

        System.out.print("Enter total of all items charged this month: ");
        int totalCharges = scanner.nextInt();

        System.out.print("Enter total of all credits applied this month: ");
        int totalCredits = scanner.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = scanner.nextInt();

        int newBalance = beginningBalance + totalCharges - totalCredits;

        System.out.println("New balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

    }
}
