package com.edison.prac03less12;

public class Student implements Comparable<Student> {
	String code, name;
	Double mark1, mark2, mark3;

	public Student() {
	}

	public Student(String code, String name, Double mark1, Double mark2, Double mark3) {
		this.code = code;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public double avg_mark() {
		return (mark1 + mark2 + mark3) / 3;
	}

	public void printS() {
		System.out.printf("%-10s%-20s%10.2f%10.2f%10.2f%10.2f", code, name, mark1, mark2, mark3, this.avg_mark());
		System.out.print("\n");
	}

	public int compareTo(Student s) {

		if (this.avg_mark() < s.avg_mark())
			return -1;
		else if (this.avg_mark() == s.avg_mark())
			return 0;
		else
			return 1;
	}

}
