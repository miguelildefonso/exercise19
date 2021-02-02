package org.fujitsu.training.codes;

public class Hotel {
	
	private String name;
	private Room room;
	
	public Hotel() {
	}
	
	public Hotel(String name, Room room) {
		this.name = name;
		this.room = room;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
	

}
