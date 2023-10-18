package com.sunbeam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	static Scanner sc = new Scanner(System.in);

	private int id;

	public Employee() {

	}

	public Employee(int id) {
		super();
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void accept() {
		System.out.println("Enter the employee ID :");
		id = sc.nextInt();

	}

	public static int menu() {
		int choice = 0;
		System.out.println("1.Addition of Elements");
		System.out.println("2.Deletion of Elements");
		System.out.println("3.Find the Element");
		System.out.println("4.Sort the Element");
		System.out.println("5.Edit the Element");
		System.out.println("0.Exit");
		System.out.println("*****************************");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		List<Employee> list = new LinkedList<>();

		int choice = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Employee e = new Employee();
				e.accept();
				list.add(e);

//				System.out.println("Employee with ID " + e + " has been added.");
				break;
			case 2:
				System.out.println("Enter emp id to be deleted: ");
				int idToDelete = sc.nextInt();
				boolean removed = false;

				for (Employee emp : list) {
					if (emp.getId() == idToDelete) {
						list.remove(emp);
						removed = true;
						System.out.println("Employee with ID " + idToDelete + " has been deleted.");
						break;
					}
				}
				break;
			case 3:
				System.out.println("Enter the employee you wish to find: ");
				int idToFind = sc.nextInt();
				for (Employee emp : list)
					if (list.contains(emp))
						System.out.println("Employee Found");
					else {
						System.out.println("Employee NOt Found");
					}
				break;
			case 4:
				Collections.sort(list, (emp1, emp2) -> Integer.compare(emp1.getId(), emp2.getId()));
				System.out.println("Employees sorted by ID:");
				for (Employee emp : list) {
					System.out.println("Employee ID: " + emp.getId());
				}
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);
				int index = list.indexOf(key);
				if (index == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = list.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.accept();
					list.set(index, newEmp);
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}
