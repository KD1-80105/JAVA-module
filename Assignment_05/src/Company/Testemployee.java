/**
 * 
 */
package Company;

import java.util.Scanner;

/**
 * @author akhil
 *
 */
public class Testemployee {
	@SuppressWarnings("resource")
	public static int menu() {
		int choice;
		System.out.println("----------Select the type of Employee--------");
		System.out.println("1.Salaried Employees");
		System.out.println("2.Hourly Employees");
		System.out.println("3.Commision Employees");
		System.out.println("4.Base-Salaried");
		System.out.println("5.Display all Employees");
		System.out.println("0.Exit");
		System.out.println("enter your choice :");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int totalEmployee = 0;
		int counter = 0;
		System.out.println("enter the number of employees :");
		totalEmployee = sc.nextInt();
		Employee[] employee = new Employee[totalEmployee];

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (counter < totalEmployee) {
					employee[counter] = new salariedEmployee();
					employee[counter].acceptData();
					employee[counter].calculateEarnings();
					counter++;
				} else {
					System.out.println("employees are full");
				}

				break;
			case 2:
				if (counter < totalEmployee) {
					employee[counter] = new hourlyEmployee();
					employee[counter].acceptData();
					employee[counter].calculateEarnings();
					counter++;
				} else {
					System.out.println("employees are full");
				}
				break;
			case 3:
				if (counter < totalEmployee) {
					employee[counter] = new commisionEmployee();
					employee[counter].acceptData();
					employee[counter].calculateEarnings();
					counter++;
				} else {
					System.out.println("employees are full");
				}
				break;
			case 4:

				if (counter < totalEmployee) {
					employee[counter] = new baseplusCommEmployee();
					employee[counter].acceptData();
					employee[counter].calculateEarnings();
					counter++;
				} else {
					System.out.println("employees are full");
				}
				break;
			case 5:
				for (Employee employee2 : employee)
					if (employee2 != null) {
						employee2.displayData();
					}
				break;
			case 0:
				break;
			default:
				System.out.println("wrong choice !!!");
				break;
			}
		}
		System.out.println("Visit Again");
	}

}
