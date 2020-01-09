package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getConnection {
	public Connection Connection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/demo";
		String username = "root";
		String password = "lin000805";
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
			System.out.println("Connect Successfully!");
		} catch(ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
