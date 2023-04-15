package model;

public class Rooms {
	private Long id;
	private String room_name;
	private int capacity;
	
	public Rooms(Long id, String room_name, int capacity) {
		super();
		this.id = id;
		this.room_name = room_name;
		this.capacity = capacity;
	}
	public Rooms() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Rooms [id=" + id + ", room_name=" + room_name + ", capacity=" + capacity + "]";
	}

	
	
	
}
