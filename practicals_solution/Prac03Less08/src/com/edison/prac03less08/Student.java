package com.edison.prac03less08;

public class Student extends Person {

	double mark;

	public Student(String iD, String name, int byear, double mark) {
		super(iD, name, byear);
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", ID=" + ID + ", name=" + name + ", byear=" + byear + "]";
	}

}
