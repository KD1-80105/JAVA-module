package Company;

public class baseplusCommEmployee extends commisionEmployee {
	double baseSalary;
	double baseTotal;

	public baseplusCommEmployee() {
		this("", "", 0, 0, 0, 0, 0, 0);
	}

	public baseplusCommEmployee(String firstname, String lastname, int sSN, double grossSales, double commisionRate,
			double totalCommision, double baseSalary, double baseTotal) {
		super(firstname, lastname, sSN, grossSales, commisionRate, totalCommision);
		this.baseSalary = baseSalary;
		this.baseTotal = baseTotal;
	}

	public double getBaseSalry() {
		return baseSalary;
	}

	public void setBaseSalry(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.println("enter the base salary :");
		baseSalary = sc.nextDouble();

	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("the base salary is :"+baseSalary);
		calculateEarnings();
		
	}

	@Override
	public void calculateEarnings() {
		super.calculateEarnings();
		baseSalary=baseSalary*.10;
		System.out.println("base salary with bonus :"+baseSalary);
		baseTotal = (commisionRate * grossSales) + baseSalary;
		System.out.println("the base salary pf the employees is :" + baseTotal);
	}

}
