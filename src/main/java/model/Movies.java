package model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Movies{
	private Long id;
	private String tittle;
	private String decription;
	private String image;
	private int total_time;
	private String actor;
	private String director;
	private String language;
    private Date datestart;
	private String long_decrip;
	private String banner;
	
	
	public Movies(Long id, String tittle, String decription, String image, int total_time, String actor,
			String director, String language, Date datestart, String long_decrip, String banner) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.decription = decription;
		this.image = image;
		this.total_time = total_time;
		this.actor = actor;
		this.director = director;
		this.language = language;
		this.datestart = datestart;
		this.long_decrip = long_decrip;
		this.banner = banner;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public Movies() {
	
	}
	
	public String getDatestart() {
		String dateui;
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		dateui= df.format(datestart);
		return dateui;
	}
	public void setDatestart(Date datestart) {
	     this.datestart=datestart;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getTotal_time() {
		return total_time;
	}
	public void setTotal_time(int total_time) {
		this.total_time = total_time;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public int getTime() {
		return total_time;
	}
	public void setTime(int time) {
		this.total_time = time;
	}

	public String getLong_decrip() {
		return long_decrip;
	}

	public void setLong_decrip(String long_decrip) {
		this.long_decrip = long_decrip;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", tittle=" + tittle + ", decription=" + decription + ", image=" + image
				+ ", total_time=" + total_time + ", actor=" + actor + ", director=" + director + ", language="
				+ language + ", timestart=" + datestart + "]";
	}
	
	
}
