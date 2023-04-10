package com.edison.prac01less08;

public class VNProduct extends Product {
	private int year;

	public VNProduct() {
	}

	public VNProduct(String name, String code, double price, int year) {
		super(name, code, price);
		this.year = year;
	}

	public double getSalePrice() {
		double gPrice = super.getPrice();
		if (year < 2015)
			gPrice = 0.8 * gPrice;
		else if (year < 2020)
			gPrice = 0.85 * gPrice;

		return gPrice;
	}

	@Override
	public String toString() {
		return super.getName() + "\t" + super.getCode() + "\t" + super.getPrice() + "\t" + getSalePrice() + "\t" + year;
	}

}
