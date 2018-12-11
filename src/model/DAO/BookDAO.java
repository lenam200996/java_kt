package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Book;

public class BookDAO {
	private String url = "jdbc:sqlserver://localhost:1433;databaseName=Data076";
	Connection c;
	ArrayList<Book> arr = new ArrayList<>();

	public void connect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			c = DriverManager.getConnection(url, "sa", "123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Book> getArr(String id) {
		connect();
		String sql = "select * from Books where UserID = '" + id + "'";
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Book b = new Book();
				b.setId(id);
				b.setTensach(rs.getString("tensach"));
				b.setNhaxb(rs.getString("nhaxb"));
				b.setNamsx(rs.getString("namsx"));
				b.setSoluong(rs.getInt("soluong"));

				arr.add(b);
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
