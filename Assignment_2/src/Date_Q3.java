public class Date_Q3 {
	private int month;
	private int day;
	private int year;

	public Date_Q3(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("Invalid month. Please enter a value between 1 and 12.");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			System.out.println("Invalid day. Please enter a value between 1 and 31.");
		}
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 2100) {
			this.year = year;
		} else {
			System.out.println("Invalid year. Please enter a value between 1900 and 2100.");
		}
	}

	public int getYear() {
		return year;
	}

	public void displayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}

class DateTest {
	public static void main(String[] args) {
		Date_Q3 dateObj = new Date_Q3(0, 0, 0);
		System.out.print("Initial Date: ");
		dateObj.displayDate();

		dateObj.setMonth(11);
		dateObj.setDay(15);
		dateObj.setYear(2023);

		System.out.print("Updated Date: ");
		dateObj.displayDate();
	}
}
