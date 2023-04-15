package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Ticket;

public class TicketDAO extends ConnectDB {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement statement = null;
    public Ticket ticket;
    public List<Ticket> getListTicketBYID(Long a) throws ClassNotFoundException {
		List<Ticket> listticket = new ArrayList<>();
		String sql = "SELECT * FROM db_bookticketmovie.ticket\r\n" + 
				"where account_id =?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
	        statement.setLong(1, a);
			rs = statement.executeQuery();
			while (rs.next()) {
				listticket.add(new Ticket(	
						rs.getLong(1), 
						rs.getLong(2), 
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(14)
						));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listticket;
	}
    public List<Ticket> gettotalticket() throws ClassNotFoundException {
		List<Ticket> listticket = new ArrayList<>();
		String sql = "SELECT * FROM db_bookticketmovie.ticket";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				listticket.add(new Ticket(	
						rs.getLong(1), 
						rs.getLong(2), 
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(14)
						));
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listticket;

	}
    public List<Ticket> getpriceBydate(String date) throws ClassNotFoundException {
		List<Ticket> listticket = new ArrayList<>();
		String sql = "SELECT * FROM db_bookticketmovie.ticket where settime=?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, date);
			rs = statement.executeQuery();
			while (rs.next()) {
				listticket.add(new Ticket(	
						rs.getLong(1), 
						rs.getLong(2), 
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(14)
						));
						
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listticket;

	}
    public void SetstatusChoese(String check) {
    	String sql="UPDATE seat\r\n" + 
    			"SET status = 1\r\n" + 
    			"WHERE id=?;";
    	try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, check);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    }
    public void SetstatusUnchose(String check) {
    	String sql="UPDATE seat\r\n" + 
    			"SET status = 0\r\n" + 
    			"WHERE id=?;";
    	try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, check);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    }
	public void Getdata(Long user_id,String user_name,
			String movie_name,String date,String time,
			String room_name,String seat_name,String setdate,int price,Long seat_id,Long movie_id,String settime) throws SQLException {
		String sql="insert into ticket(account_id,user_name,movie_name,date,"
				+ "time,room_name,seat_name,settime,price,seat_id,movie_id,settime_in) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		   try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setLong(1, user_id);
			statement.setString(2, user_name);
			statement.setString(3, movie_name);
			statement.setString(4, date);
			statement.setString(5, time);
			statement.setString(6, room_name);
			statement.setString(7, seat_name);
			statement.setString(8, setdate);
			statement.setInt(9, price);
			statement.setLong(10, seat_id);
			statement.setLong(11, movie_id);
			statement.setString(12, settime);
			statement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	 public Ticket deleleTicket(String ticket_id) throws SQLException {
		 String sql="delete FROM db_bookticketmovie.ticket where idTicket=?";
			try {
				conn=new ConnectDB().getConnection();
				statement=conn.prepareStatement(sql);
				statement.setString(1, ticket_id);
				statement.executeUpdate();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			return ticket;	 
	 }
 
public static void main(String[] args) {
	TicketDAO t=new TicketDAO();
	Long a=(long) 3;
	List<Ticket> l;
	try {
		l = t.getListTicketBYID(a);
		for(Ticket taket:l) {
			System.out.println(taket);
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}	
}
