package com.edison.prac01less08;

public class Product {
	private String name;
	private String code;
	private double price;

	public Product() {
	}

	public Product(String name, String code, double price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return name + "\t" + code + "\t" + price;
	}
}
