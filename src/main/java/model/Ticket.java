package model;

public class Ticket {
	 private Long id;
	 private Long user_id;
	 private String user_name;
	 private String movie_name;
	 private String date;
	 private String time;
	 private String room_nam;
	 private String seat_name;
	 private String setdate;
	 private String price;
	 private String settime;
	 private int totalMoney;
	 
	
	public Ticket(Long id, Long user_id, String user_name, String movie_name, String date, String time, String room_nam,
			String seat_name, String setdate, String price, String settime) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.user_name = user_name;
		this.movie_name = movie_name;
		this.date = date;
		this.time = time;
		this.room_nam = room_nam;
		this.seat_name = seat_name;
		this.setdate = setdate;
		this.price = price;
		this.settime = settime;
	}

	public String getSetdate() {
		return setdate;
	}
	
	public void setSetdate(String setdate) {
		this.setdate = setdate;
	}


	public Ticket() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRoom_nam() {
		return room_nam;
	}
	public void setRoom_nam(String room_nam) {
		this.room_nam = room_nam;
	}
	public String getSeat_name() {
		return seat_name;
	}
	public void setSeat_name(String seat_name) {
		this.seat_name = seat_name;
	}
	public String getSettime() {
		return settime;
	}
	public void setSettime(String settime) {
		this.settime = settime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = "55000";
		
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		
		this.totalMoney=totalMoney;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", user_id=" + user_id + ", user_name=" + user_name + ", movie_name=" + movie_name
				+ ", date=" + date + ", time=" + time + ", room_nam=" + room_nam + ", seat_name=" + seat_name
				+ ", setdate=" + setdate + ", price=" + price + ", settime=" + settime + "]";
	}
	
	
	
	 
	 
}
