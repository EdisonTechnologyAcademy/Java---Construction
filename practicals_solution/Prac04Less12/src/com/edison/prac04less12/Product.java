package com.edison.prac04less12;

public class Product {
	String ID, Name;
	double Amount, Price;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double Amount) {
		this.Amount = Amount;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double Price) {
		this.Price = Price;
	}

	public Product(String ID, String Name, double Amount, double Price) {
		this.ID = ID;
		this.Name = Name;
		this.Amount = Amount;
		this.Price = Price;
	}

	public Product() {
	}

	public double Total() {
		return Amount * Price;
	}

	@Override
	public String toString() {
		return ID + "\t" + Name + "\t" + Amount + "\t" + Price + "\t" + Total();

	}
}
