package model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Schedule {
	private Long id;
	private Date date;
	
	
	public Long getId() {
		return id;
	}
	public Schedule(Long id, Date date) {	
		this.id = id;
		this.date = date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		String dateui;
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		dateui= df.format(date);
		return dateui;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
