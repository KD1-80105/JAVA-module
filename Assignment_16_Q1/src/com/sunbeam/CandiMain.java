package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandiMain {

	public static int menu() {
		int choice1 = 0;
		System.out.println("0.Exit");
		System.out.println("1.Add the candidate");
		System.out.println("2.Update the candidate");
		System.out.println("3.Display candidates party wisw as per no. of votes");
		System.out.println("Enter the choice");
		return choice1 = sc.nextInt();
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Candidate> list = new ArrayList<>();
		List<PartyVotes> list1 = new ArrayList<PartyVotes>();

		try (CandidateDAO cDao = new CandidateDAO()) {

			int choice = 0;

			while ((choice = menu()) != 0) {

				switch (choice) {
				case 1:

					int count = cDao.save();
					System.out.println(count);
					break;
				case 2:
					int count1 = cDao.update();
					System.out.println(count1);
					break;
				case 3:
					System.out.println("Display votes as per party");
					list1 = cDao.getVotesPartyWise();
					list1.forEach(p -> System.out.println(p));
					break;
				case 0:

					break;
				default:
					System.out.println("Wrong choice!!!");
					break;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
