package model;

public class Bills {
      private Long user_id;
      private Long film_id;
      private Long room_id;
      private int sum_seat;
      private int sum_price;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
	}
	public Long getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Long room_id) {
		this.room_id = room_id;
	}
	public int getSum_seat() {
		return sum_seat;
	}
	public void setSum_seat(int sum_seat) {
		this.sum_seat = sum_seat;
	}
	public int getSum_price() {
		return sum_price;
	}
	public void setSum_price(int sum_price) {
		this.sum_price = sum_price;
	}
   
}
