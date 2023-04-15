package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Rooms;

public class RoomDAO extends ConnectDB{
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement statement = null;

	public List<Rooms> getListRoom() throws ClassNotFoundException {
		List<Rooms> listroom = new ArrayList<>();
		String sql = "SELECT * FROM room";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			
			rs = statement.executeQuery();
			while (rs.next()) {
				listroom.add(new Rooms(
						rs.getLong(1), 
						rs.getString(2),
						rs.getInt(7)
						));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listroom;

	}
	public Rooms getRoomBYID(String room_id) throws ClassNotFoundException {
		String sql = "SELECT * FROM room where id=?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, room_id);
			rs = statement.executeQuery();
			while (rs.next()) {
				return new Rooms(
						rs.getLong(1), 
						rs.getString(2),
						rs.getInt(7)
						);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public void AddRoom(String room_name,String capacity) {
		String sql="insert into room(name_room,capacity) values (?,?)";	
		try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, room_name);
			statement.setString(2, capacity);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
		
	}
	public void deleteRoom(String id) {
		String sql="delete from room where id =?";
		
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
