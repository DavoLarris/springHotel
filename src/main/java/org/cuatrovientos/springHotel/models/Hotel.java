package org.cuatrovientos.springHotel.models;

import java.util.Vector;

public class Hotel {
	private String name;
	private Vector<Room> rooms;
	
	/**
	 * 
	 */
	public Hotel() {
	}
	
	/**
	 * @param name
	 * @param rooms
	 */
	public Hotel(String name, Vector<Room> rooms) {
		this.name = name;
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Vector<Room> rooms) {
		this.rooms = rooms;
	}

	private String showAll(){
		String result = "\n";
		for (Room room: this.rooms){
			result += "  - " + room.toString() + "\n";
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rooms=" + this.showAll() + "]";
	}
	
}
