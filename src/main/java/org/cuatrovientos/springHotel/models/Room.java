package org.cuatrovientos.springHotel.models;

public class Room {
	private Integer number;
	private String type;
	private String description;
	private Guest guest;
	
	/**
	 * 
	 */
	public Room() {
	}
	
	/**
	 * @param number
	 * @param type
	 * @param description
	 * @param guest
	 */
	public Room(Integer number, String type, String description, Guest guest) {
		this.number = number;
		this.type = type;
		this.description = description;
		this.guest = guest;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	
	public void freeRoom(){
		this.guest = null;
	}
	
	@Override
	public String toString() {
		return "Room [number=" + number + ", type=" + type + ", description=" + description + ", guest=" + guest + "]";
	}
}
