package model;

public class Seats extends Rooms{
	     private Long id;
         private String seat_name;
         private int status;
         private int id_room;
		
		
		
		public Seats(Long id, String seat_name, int status, int id_room) 
		{		
			this.id = id;
			this.seat_name = seat_name;
			this.status = status;
			this.id_room = id_room;
		}
		public int getId_room() {
			return id_room;
		}
		public void setId_room(int id_room) {
			this.id_room = id_room;
		}
		public Seats() {
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSeat_name() {
			return seat_name;
		}
		public void setSeat_name(String seat_name) {
			this.seat_name = seat_name;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Seats [id=" + id + ", seat_name=" + seat_name + ", status=" + status + "]";
		}
		
	
	
		
		
}
