package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateDAO implements AutoCloseable {
	static Scanner sc = new Scanner(System.in);

	private Connection con;

	public CandidateDAO() throws SQLException {
		con = Dbutil.getConnection();

	}

	@Override
	public void close() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// add new candidate

	public int save() throws SQLException {
		String sql = "INSERT INTO candidates(name, party, votes) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			System.out.println("Insert into the table.....");
			System.out.print("First Name: ");
			String name = sc.next();
			System.out.print("Enter the party name: ");
			String pname = sc.next();
			System.out.print("Enter the number of Votes: ");
			int vote = sc.nextInt();

			stmt.setString(1, name);
			stmt.setString(2, pname);
			stmt.setInt(3, vote);

			int cnt = stmt.executeUpdate();
			System.out.println("Rows Inserted: " + cnt);
			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public int update() throws SQLException {
		String sql = "UPDATE candidates SET name=?, party=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			System.out.println("Enter the ID to be modified: ");
			int ID = sc.nextInt();
			System.out.print("First Name: ");
			String fname = sc.next();
			System.out.print("Party Name: ");
			String pname = sc.next();

			stmt.setString(1, fname);
			stmt.setString(2, pname);
			stmt.setInt(3, ID);

			int cnt = stmt.executeUpdate();
			System.out.println("Rows Updated: " + cnt);
			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List<PartyVotes>  getVotesPartyWise() throws SQLException {
		List<PartyVotes> list = new ArrayList<>();
		String sql = "SELECT party, SUM(votes) as total_votes FROM candidates GROUP BY party";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String party = rs.getString("party");
					int totalVotes = rs.getInt("total_votes");
					PartyVotes p = new PartyVotes(party, totalVotes);
					list.add(p);
				}
			}
		}
		return list;

	}

}
