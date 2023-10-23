package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		@SuppressWarnings("unused")
		int choice = 0;
		System.out.println("***********************");
		System.out.println("0.Exit");
		System.out.println("1.Add User");
		System.out.println("2.update User");
		System.out.println("3.Delete User");
		System.out.println("4.Read User");
		System.out.println("5.Update status");
		System.out.println("6.Display Specific user");
		System.out.println("Enter you choice :");
		return choice = sc.nextInt();
	}

	public static void main(String[] args) throws SQLException {
		List<User> user = new ArrayList<User>();

		try (UserDAO ud = new UserDAO()) {
			int choice = 0;
			while ((choice = menu()) != 0) {
				switch (choice) {
				case 1:

					System.out.println("Insert into the table.....");
					System.out.print("First Name: ");
					String fname = sc.next();
					System.out.print("Last Name: ");
					String lname = sc.next();
					System.out.print("Enter the email: ");
					String email = sc.next();
					System.out.print("Enter the password: ");
					String pass = sc.next();
					System.out.println("Enter the date: ");
					String date = sc.next();

					int count = ud.addUser(fname, lname, email, pass, date);
					System.out.println("Rows Effected...." + count);

					break;
				case 2:

					System.out.println("Enter the ID to be modified: ");
					int ID = sc.nextInt();
					System.out.print("First Name: ");
					String fname1 = sc.next();
					System.out.print("Last Name: ");
					String lname1 = sc.next();
					System.out.print("Enter the email: ");
					String email1 = sc.next();
					System.out.println("Enter the password to update: ");
					String passwd = sc.next();
					System.out.println("Enter the date: ");
					String date1 = sc.next();

					int count1 = ud.updateUser(fname1, lname1, email1, passwd, date1, ID);
					System.out.println("Rows updated...." + count1);
					break;
				case 3:

					System.out.println("Enter the id to be deleted: ");
					int id = sc.nextInt();
					int count2 = ud.deleteUser(id);
					System.out.println("Rows Deleted...." + count2);
					break;
				case 4:
					user = ud.readUser();
					user.forEach(ud1 -> System.out.println(ud));
					break;
				case 5:
					System.out.println("Enter the id to change the status: ");
					int id1 = sc.nextInt();
					int count3 = ud.changeStatus(id1);
					System.out.println("Rows Updated...." + count3);
					break;
				case 6:
					System.out.println("Enter the id of the user you wish to see:");
					int id2 = sc.nextInt();
					List<User> count4 = ud.displaySpecific(id2);
					count4.forEach(s->System.out.println(s));
					System.out.println("Rows affected.....");
					
					break;
				case 0:
					System.out.println("Exiting...");
					break;
				default:
					System.err.println("Invalid Choice !!");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
