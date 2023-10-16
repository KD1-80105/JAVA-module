import java.util.Scanner;

public class ExceptionQ2 {

	private static double x;
	private static double y;
	private static double diameter;

	public ExceptionQ2() {
		this(0, 0, 100.0);
	}

	public ExceptionQ2(double x, double y, double diameter) {
		super();
		this.x = x;
		this.y = y;
		this.diameter = diameter;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws InvalidDiameterException {
		if (this.diameter < 0.0) {
			System.out.println("The Coordinates are :" + x + " and " + y+"\n");
			
				throw new InvalidDiameterException();
		} 
		else {
			System.out.println("you value is okayy!!!");
		}

		this.diameter = diameter;
	}


	public static void main(String[] args) throws InvalidDiameterException {
		Scanner sc = new Scanner(System.in);

		ExceptionQ2 exceptionQ2 = new ExceptionQ2();

		System.out.println("enter the x and y coordinates for the circle :");
		x = sc.nextDouble();
		y = sc.nextDouble();
		System.out.println("also provide the diameter for the circle :");
		diameter = sc.nextDouble();
		exceptionQ2.setDiameter(diameter);

		

		
	}

}
