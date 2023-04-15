package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Seats;

public class SeatDAO extends ConnectDB{
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement statement = null;


	public List<Seats> getListSeatsBYID(String Rid) throws ClassNotFoundException {
		List<Seats> listseat = new ArrayList<>();
		String sql = "SELECT * FROM db_bookticketmovie.seat\r\n" + 
				"where id_room =?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
	        statement.setString(1, Rid);
			rs = statement.executeQuery();
			while (rs.next()) {
				listseat.add(new Seats(rs.getLong(1), 
						rs.getString(2),
						rs.getInt(3), 
						rs.getInt(4)
						));
						
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listseat;

	}
	public Seats getSeatsBYID(String Sid) throws ClassNotFoundException {
	
		String sql = "SELECT * FROM db_bookticketmovie.seat\r\n" + 
				"where id =?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
	        statement.setString(1, Sid);
			rs = statement.executeQuery();
			while (rs.next()) {
				return new Seats(rs.getLong(1), 
						rs.getString(2),
						rs.getInt(3), 
						rs.getInt(4)
						);
						
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public void AddSeatFromRoom(String name_seat,String status,String id_room) {
		String sql="insert into seat(name_seat,status,id_room) values (?,?,?);";
		
		try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, name_seat);
			statement.setString(2, status);
			statement.setString(3, id_room);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
	public void deleteSeatFromRoom(String id) {
		String sql="delete from seat where id_room=?";
		
		try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, id);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
	

}
