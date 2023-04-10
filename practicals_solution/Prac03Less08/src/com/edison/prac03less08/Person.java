package com.edison.prac03less08;

public class Person {
	String ID, name;
	int byear;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	public Person(String iD, String name, int byear) {
		ID = iD;
		this.name = name;
		this.byear = byear;
	}

	public Person() {

	}
}
