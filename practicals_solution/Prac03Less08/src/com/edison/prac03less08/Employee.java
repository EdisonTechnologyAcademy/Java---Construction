package com.edison.prac03less08;

public class Employee extends Person {
	double salary;

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", ID=" + ID + ", name=" + name + ", byear=" + byear + "]";
	}

	public Employee(String iD, String name, int byear, double salary) {
		super(iD, name, byear);
		this.salary = salary;
	}

}
