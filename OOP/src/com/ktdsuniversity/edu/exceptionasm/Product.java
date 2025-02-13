package com.ktdsuniversity.edu.exceptionasm;

public class Product {
	private int number;
	private String name;
	private int price;
	private int stock;
	private int remainingDay;
	
	public Product(int number, String name, int price, int stock, int remainingDay) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.remainingDay = remainingDay;
	}
	
	@Override
	public String toString() {
	    return "ID: " + this.number 
	            + ", Name: " + this.name 
	            + ", Price: " + this.price 
	            + ", Stock: " + this.stock 
	            + ", Remaining Days: " + this.remainingDay + "\n";
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int getStockNumber() {
		return this.stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getRemainingDay() {
		return this.remainingDay;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}