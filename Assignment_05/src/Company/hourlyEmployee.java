package Company;

public class hourlyEmployee extends Employee {
	double wage;
	double hours;
	double totalSalary;

	public hourlyEmployee() {
		this("", "", 0, 0, 0, 0);
	}

	public hourlyEmployee(String firstname, String lastname, int sSN, double wage, double hours, double totalSalary) {
		super(firstname, lastname, sSN);
		this.wage = wage;
		this.hours = hours;
		this.totalSalary = totalSalary;
	}

	public void acceptData() {
		super.acceptData();
		System.out.println("enter the hours he works :");
		hours = sc.nextDouble();
		System.out.println("enter the wage he gets :");
		wage = sc.nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("employee works for " + hours + " hours and he gets the wage of " + wage + "rupees");
		System.out.println("the total salry employee hgets is :" + totalSalary);

	}

	public void calculateEarnings() {
		if (this.hours <= 40) {
			this.totalSalary = this.wage * this.hours;
		} else if (this.hours > 40) {
			this.totalSalary = 40 * this.wage + (this.hours - 40) * this.wage * 1.5;
		}

	}
}
