package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;

public class AccountsDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/sukkiriShop";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	private final String SQL_FIND_BY_LOGIN = 
			"""
			SELECT USER_ID, PASS, MAIL, NAME, AGE FROM ACCOUNTS
			WHERE USER_ID = ? AND PASS = ?
			""";
	
	public Account findByLogin(Login login) {
		Account account = null;
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバをロードできません");
		}
		
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			PreparedStatement ps = conn.prepareStatement(SQL_FIND_BY_LOGIN);
			ps.setString(1, login.getUserId());
			ps.setString(2, login.getPass());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String userId = rs.getString("USER_ID");
				String pass = rs.getString("PASS");
				String mail = rs.getString("MAIL");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				account = new Account(userId, pass, mail, name, age);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return account;
		
	}
}
