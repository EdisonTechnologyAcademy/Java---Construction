package com.edison.Prac01lLess18;

public class Student {
	  private Address address;

	    public Student(Address address){
	        this.address = address;
	    }

	    public void print(){
	        System.out.println("Student class method called ...");
	        address.print();
	    }

	    public void init(){
	        System.out.println("Intialization logic");
	    }

	    public void destroy(){
	        System.out.println("Destruction logic");
	    }
}
