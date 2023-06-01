package com.cart.model;

import java.util.ArrayList;
import java.util.List;

public class Shipment implements Item {

	private String name;
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	
	public double getPrice() {
		double total = 0;
		for (Item item : items) {
			total += item.getPrice();
		}
		return total;
	}

		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		int total = 0;
		for (Item item : items) {
			total += item.getWeight();
		}
		return total + 10;
	}
	
}
