package Company;

public class salariedEmployee extends Employee {
	int weeklySalary;

	public salariedEmployee() {
		this("", "", 0, 0);
	}

	public salariedEmployee(String firstname, String lastname, int sSN, int weeklySalary) {
		super(firstname, lastname, sSN);
		this.weeklySalary = weeklySalary;
	}

	public void acceptData() {
		super.acceptData();
		System.out.println("enter the weekly salary employee gets :");
		weeklySalary = sc.nextInt();
	}

	public void displayData() {
		super.displayData();
		System.out.println("weekly salary of the employee is :" + weeklySalary);
	}

	@Override
	public void calculateEarnings() {

	}

}
