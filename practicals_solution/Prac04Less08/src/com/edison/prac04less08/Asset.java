package com.edison.prac04less08;

public class Asset {
	private int id;     
	private String type;
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public Asset(int id, String type) {
		this.id = id;
		this.type = type;
	}  
}
