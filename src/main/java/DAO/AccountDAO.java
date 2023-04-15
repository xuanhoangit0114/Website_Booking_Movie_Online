package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.AccountS;

public class AccountDAO extends ConnectDB {
	PreparedStatement statement = null;
	ResultSet rs = null;
	Connection conn = null;

	public AccountS Login(String numberphone, String password) throws ClassNotFoundException {
		String sql = "SELECT * FROM account where phone_number =? and password=?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, numberphone);
			statement.setString(2, password);
			rs = statement.executeQuery();
			while (rs.next()) {
				return new AccountS(
						rs.getLong(1), 
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getLong(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<AccountS> getListAcc() throws ClassNotFoundException {
		List<AccountS> listacc=new ArrayList<>();
		String sql = "select * from account ";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				listacc.add( new AccountS(rs.getLong(1), 
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4),
						rs.getLong(5)));

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listacc;
	}
	
	public AccountS CheckAccountSingup(String numberphone) throws ClassNotFoundException {
		String sql = "select * from account where phone_number =? ";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, numberphone);
			rs = statement.executeQuery();
			while (rs.next()) {
				return new AccountS(rs.getLong(1), 
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4),
						rs.getLong(5));

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	public void AddAccount(String user_name,String number_phone, String password,String roleid) throws ClassNotFoundException {
		String sql = "insert into account(fullname,phone_number,password,role_id) values(?,?,?,?)";	
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, user_name);
			statement.setString(2, number_phone);
			statement.setString(3, password);
			statement.setString(4, roleid);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	


}   
	public void SignUp(String user_name,String number_phone, String password) throws ClassNotFoundException {
		String sql = "insert into account(fullname,phone_number,password) values(?,?,?)";	
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, user_name);
			statement.setString(2, number_phone);
			statement.setString(3, password);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	


}   
	public void DeleteAccout(String id) {
		String sql="delete from account where id=?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AccountDAO dao=new AccountDAO();
	
		String c="0363875530";
		try {
			dao.CheckAccountSingup(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
