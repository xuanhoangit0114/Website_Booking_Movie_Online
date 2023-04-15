package DAO;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
	PreparedStatement statement;
	static Connection connect;
	public Connection getConnection() throws ClassNotFoundException {
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3307/db_bookticketmovie?useUnicode=true&characterEncoding=UTF-8";
			String user ="root";
			String password ="0363875530Giang";
			return DriverManager.getConnection(url,user,password);
		}
			catch(SQLException e) {
				   System.out.println(e.getMessage());
				} finally {
					try{
				           if(conn != null)
				             conn.close();
					}catch(SQLException ex){
				           System.out.println(ex.getMessage());
					}
				}
		return conn;
		}
	public static void main(String[] args) throws SQLException, FileNotFoundException {
		
	}
	
}

