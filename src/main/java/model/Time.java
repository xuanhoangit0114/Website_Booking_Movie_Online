package model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Time {
	private Long id;
	private Date time;
	private Long date_id;
	
	public Time(Long id, Date time, Long date_id) {
		super();
		this.id = id;
		this.time = time;
		this.date_id = date_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTime() {
		String dateui;
		SimpleDateFormat df=new SimpleDateFormat("HH:mm",Locale.UK);
		dateui= df.format(time);
		return dateui;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Long getDate_id() {
		return date_id;
	}
	public void setDate_id(Long date_id) {
		this.date_id = date_id;
	}
	@Override
	public String toString() {
		return "Time [id=" + id + ", time=" + getTime() + ", date_id=" + date_id + "]";
	}
	

}
