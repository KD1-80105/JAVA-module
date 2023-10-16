package Company;

import java.util.Scanner;

abstract public class Employee {

	String firstname;
	String lastname;
	int SSN;

	public Employee() {
		this("", "", 0);
	}

	public Employee(String firstname, String lastname, int sSN) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		SSN = sSN;

	}

	abstract public void calculateEarnings();

	Scanner sc = new Scanner(System.in);

	public void acceptData() {
		System.out.println("Enter the firstname :");
		firstname = sc.next();
		System.out.println("Enter the lastname :");
		lastname = sc.next();
		System.out.println("Enter the SSN :");
		SSN = sc.nextInt();
	}

	public void displayData() {
		System.out.println("Employee Firstname is :" + firstname);
		System.out.println("Employee lastname is :" + lastname);
		System.out.println("Employee's social security number is :" + SSN);

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

}
