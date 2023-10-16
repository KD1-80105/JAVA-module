package Company;

public class commisionEmployee extends Employee {
	double grossSales;
	double commisionRate;
	double totalCommision;

	public commisionEmployee() {
		this("", "", 0, 0, 0, 0);

	}

	public commisionEmployee(String firstname, String lastname, int sSN, double grossSales, double commisionRate,
			double totalCommision) {
		super(firstname, lastname, sSN);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
		this.totalCommision = totalCommision;

	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.println("enter the gross sales :");
		grossSales = sc.nextDouble();
		System.out.println("enter the commision rate :");
		commisionRate = sc.nextDouble();
	}

	public void calculateEarnings() {
		totalCommision = commisionRate * grossSales;
		
		System.out.println("Total commission = "+totalCommision);
	}

	@Override
	public void displayData() {
		super.displayData();

	}

}
