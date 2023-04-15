package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Schedule;
import model.Time;

public class ScheduleDAO extends ConnectDB{
	Connection conn = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	public List<Schedule> getDate() throws ClassNotFoundException {

		List<Schedule> listdate = new ArrayList<>();
		String sql = "SELECT * FROM schedu";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				listdate.add(new Schedule(
						rs.getLong(1),
						rs.getDate(2)));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listdate;

	}

public List<Time> getListTimeByID(String Date_id) throws ClassNotFoundException {
		
		List<Time> listtime = new ArrayList<>();
		String sql="SELECT * FROM schedu_time where date_id=?";
		try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, Date_id);
			rs=statement.executeQuery();
			while(rs.next()) {
				listtime.add(new Time(
						rs.getLong(1),
						rs.getDate(2),
						rs.getLong(3)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listtime;
		

	}
public Time getTimeByID(String Time_id) throws ClassNotFoundException {
	
	
	String sql="SELECT * FROM schedu_time where id=?";
	try {
		conn=new ConnectDB().getConnection();
		statement=conn.prepareStatement(sql);
		statement.setString(1, Time_id);
		rs=statement.executeQuery();
		while(rs.next()) {
			return new Time(
					rs.getLong(1),
					rs.getDate(2),
					rs.getLong(3));
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return null;
	

}
public Schedule getDateByID(String Date_id) throws ClassNotFoundException {
	
	
	String sql="SELECT * FROM schedu where id=?";
	try {
		conn=new ConnectDB().getConnection();
		statement=conn.prepareStatement(sql);
		statement.setString(1, Date_id);
		rs=statement.executeQuery();
		while(rs.next()) {
			return new Schedule(
					rs.getLong(1),
					rs.getDate(2)
					);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return null;
	

}
public static void main(String[] args) {
	ScheduleDAO dao=new ScheduleDAO();
	String s1="2";
	try {
		List<Time> list=dao.getListTimeByID(s1);
		for(Time s:list) {
			System.out.println(s);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
