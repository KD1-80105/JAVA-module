package sunbeam;

interface Emp {
	abstract double getSal();

	default double calcIncentives() {

		return 0.0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double totalIncome = 0;
		for (Emp emp : arr) {
			totalIncome += emp.getSal() + emp.calcIncentives();
		}
		return totalIncome;

	}
}

public class Manager implements Emp {

	double basicSalary;
	double dearanceAllowance;

	public Manager(double basicSalary, double dearanceAllowance) {

		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}

	public double calcIncentives() {
		return (0.2 * basicSalary);

	}
}

class Labor implements Emp {

	int hours;
	double rate;

	public Labor(int hours, double rate) {

		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hours * rate;
	}

	public double calcIncentives() {
		if (hours > 300) {
			return (0.05 * getSal());
		}
		return 0.0;

	}

}

class Clerk implements Emp {

	double salary;

	public Clerk(double salary) {

		this.salary = salary;
	}

	@Override
	public double getSal() {

		return salary;
	}
}
