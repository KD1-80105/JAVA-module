package com.sunbeam;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO implements AutoCloseable {
	Scanner sc = new Scanner(System.in);

	private Connection con;

	public UserDAO() throws SQLException {
		con = Dbutil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// add the user

	public int addUser(String fname, String lname, String email, String pass, String date)
			throws SQLException, ParseException {
		String sql = "INSERT INTO users VALUES (default,?, ?, ?, ?, ?,true,default)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(date);
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());

			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, pass);
			stmt.setDate(5, sDate);

			int cnt = stmt.executeUpdate();
			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return 0;
	}

	// update the user
	public int updateUser(String fname, String lname, String email, String pass, String date1, int id)
			throws SQLException {
		String sql = "UPDATE users SET first_name=?, last_name=?, email=?, password=?, dob=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(date1);
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());

			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, pass);
			stmt.setDate(5, sDate);
			stmt.setInt(6, id);

			int cnt = stmt.executeUpdate();
			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// delete the user
	public int deleteUser(int id) throws SQLException {
		String sql = "DELETE from users WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// read from user
	public List<User> readUser() throws SQLException {
		List<User> user = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					java.sql.Date sDate = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String bdate = sdf.format(sDate);

					boolean status = rs.getBoolean("status");
					User u = new User(id, fname, lname, email, "****", bdate, status, "voter");
					System.out.println(u);

				}
			}
		}
		return user;
	}

	public int changeStatus(int id) throws SQLException {
		String sql = "UPDATE users SET status=1 WHERE id=? ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	public List<User> displaySpecific(int id) throws SQLException {
		List<User> user = new ArrayList<>();
		String sql = "SELECT * FROM users WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id1 = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					java.sql.Date sDate = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String bdate = sdf.format(sDate);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");

					User u = new User(id1, fname, lname, email, "****", bdate, status, role);
					System.out.println(u);
				}
			}
		}
		return user;

	}

}
