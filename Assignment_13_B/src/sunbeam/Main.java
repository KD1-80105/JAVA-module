package sunbeam;

public class Main {
	public static void main(String[] args) {
		Emp[] emp = { new Manager(25000, 2000), new Labor(12, 500), new Clerk(6000) };

		double totalIncome = Emp.calcTotalIncome(emp);
		System.out.println("Total-Salaries of Employees :" + totalIncome);

	}
}
