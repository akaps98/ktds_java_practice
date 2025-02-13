package com.ktdsuniversity.edu.file.data;

public class Product {
	private String name;
	private int price;
	private int stock;
	
	public Product(String[] itemArr) {
		this.name = itemArr[0];
		this.price = Integer.parseInt(itemArr[1]);
		this.stock = Integer.parseInt(itemArr[2]);
	}
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String toFileFormat() {
		return "%s,%d,%d".formatted(this.name, this.price, this.stock);
	}
	
	@Override
	public String toString() {
		return "%s / %d / %d".formatted(this.name, this.price, this.stock);
	}
}
