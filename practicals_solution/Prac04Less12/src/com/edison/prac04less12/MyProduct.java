package com.edison.prac04less12;

import java.util.ArrayList;

public class MyProduct implements IProduct {

	private ArrayList<Product> plist = new ArrayList<Product>();

	@Override
	public void addProduct(Product s) {
		plist.add(s);
	}

	@Override
	public void findByName(String Name) {
		System.out.println("The list of products by Name");
		for (int i = 0; i < plist.size(); i++)
			if (plist.get(i).getName().equals(Name)) {
				System.out.println(plist.get(i).toString());
			}
	}

}
