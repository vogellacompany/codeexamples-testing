package com.vogella.junit5;

public class Database {

	private int id = 42;

	public boolean isAvailable() {
		// TODO implement the access to the database
		return false;
	}
	public int getUniqueId() {
		return id;
	}
	
	public void setUniqueId(int id) {
		this.id = id;
		
	}
}
