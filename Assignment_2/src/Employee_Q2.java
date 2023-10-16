
public class Employee_Q2 {

	String firstname;
	String lastname;
	double salary;
		
	public Employee_Q2(String firstname, String lastname, double salary) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public static void main(String[] args) {
		
		Employee_Q2 employee_Q2 = new Employee_Q2("akhil", "varute", 5000);
		Employee_Q2 employee_Q22 = new Employee_Q2("prerna", "guchpa", 2000);

		
		System.out.println("Employee_Q2");
		System.out.println("the first name is :"+employee_Q2.getFirstname());
		System.out.println("the last name is :"+employee_Q2.getLastname());
		System.out.println("the salary is :"+employee_Q2.getSalary());
		
		System.out.println("Employee_Q22");
		System.out.println("the first name is :"+employee_Q22.getFirstname());
		System.out.println("the last name is :"+employee_Q22.getLastname());
		System.out.println("the salary is :"+employee_Q22.getSalary());
	}

}
