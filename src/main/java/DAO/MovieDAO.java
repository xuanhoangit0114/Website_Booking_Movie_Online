package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Movies;

public class MovieDAO extends ConnectDB{
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement statement = null;

	public List<Movies> getListMovie() throws ClassNotFoundException {
		List<Movies> listmovie = new ArrayList<>();
		String sql = "SELECT * FROM movie";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				listmovie.add(new Movies(rs.getLong(1), 
						rs.getString(2),
						rs.getString(4), 
						rs.getString(3),
						rs.getInt(5),
						rs.getString(10),
						rs.getString(11), 
						rs.getString(12),
						rs.getDate(13),
						rs.getString(14),
						rs.getString(15)));
					
				         
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listmovie;

	}
	public Movies getMovieByID(String Mid) throws ClassNotFoundException {
		
		String sql = "SELECT * FROM movie where id=?";
		try {
			conn = new ConnectDB().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, Mid);
			rs = statement.executeQuery();
			while (rs.next()) {
				return new Movies(rs.getLong(1), 
						rs.getString(2),
						rs.getString(4), 
						rs.getString(3),
						rs.getInt(5),
						rs.getString(10),
						rs.getString(11), 
						rs.getString(12),
						rs.getDate(13),
						rs.getString(14),
						rs.getString(15));
					
				         
			}
	

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public void deleteMovie(String id) {
		String sql="delete from movie where id =?";
		
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
	public void AddMovie(String name_movie,String image,String decription,
			String totaltime,String actor,String director,String languege,String date,String long_decription,String banner) {
		String sql="insert into movie(name_movie,image,decription"
				+ ",total_time,actors,director,language,durian,Banner) values (?,?,?,?,?,?,?,?,?)";
		try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, name_movie);
			statement.setString(2, image);
			statement.setString(3, decription);
			statement.setString(4, totaltime);
			statement.setString(5, actor);
			statement.setString(6, director);
			statement.setString(7, languege);
			statement.setString(8, date);
			statement.setString(9, long_decription);
			statement.setString(10, banner);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void EditMovie(String name_movie,String image,String decription,
			String totaltime,String actor,String director,String languege,String date ,String long_decription,String banner,String mid) {
		String sql="UPDATE `db_bookticketmovie`.`movie` SET `name_movie` = ?, `image` = ?,"
				+ "`decription` = ?, `total_time` = ?,"
				+ " `actors` = ?, `director` = ?, `language` = ?, `durian` = ?,`long_decription` = ?,`Banner` = ?  WHERE (`id` = ?);";
		try {
			conn=new ConnectDB().getConnection();
			statement=conn.prepareStatement(sql);
			statement.setString(1, name_movie);
			statement.setString(2, image);
			statement.setString(3, decription);
			statement.setString(4, totaltime);
			statement.setString(5, actor);
			statement.setString(6, director);
			statement.setString(7, languege);
			statement.setString(8, date);
			statement.setString(9, long_decription);
			statement.setString(10, banner);
			statement.setString(11, mid);
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
public static void main(String[] args) {
	MovieDAO dao=new MovieDAO();
	
	
}
}
