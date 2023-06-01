package com.cart.model;

public class Product implements Item {

	private double price;
	private String name;
	@Override
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private int    weight;
	public Product(double price, String name, int weight) {
		super();
		this.price = price;
		this.name = name;
		this.weight = weight;
	}
	
}
