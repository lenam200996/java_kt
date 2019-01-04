package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.bean.User;

public class UserDAO {
	private String url = "jdbc:sqlserver://localhost:1433;databaseName=Data076"; // thay Data076 bằng tên database
	Connection c;
	User u = new User();

	public void connect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			c = DriverManager.getConnection(url, "sa", "123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean check(String us, String pw) {
		connect();
		String sql = "select * from Users where username = '" + us + "' and password = '" + pw + "'";
		Statement st;
		try {
			st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				//------------------
				u.setId(rs.getString("UserID"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setFullname(rs.getString("fullname"));
				//-----------------
				return true;
			}
		} catch (SQLException e) {
			return false;
		}
		return false;
	}

	public User getUser() {
		return u;
	}

	public boolean edit(String id, String fullname) {
		connect();
		String sql = "update Users set fullname = '" + fullname + "' where UserID = '" + id + "'";
		try {
			Statement st = c.createStatement();
			int rs = st.executeUpdate(sql);
			if (rs > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
