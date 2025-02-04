package com.ktdsuniversity.edu.staticexam;

public class FruitSeller {
	public final static int FRUIT_PRICE = 1000;
	
	public int money;
	public int fruitStock;
	
	public FruitSeller() {
		this.money = 0;
		this.fruitStock = 0;
	}
	
	public FruitSeller(int money, int fruitStock) {
		super();
		this.money = money;
		this.fruitStock = fruitStock;
	}
	
	public void sell(int quantity) {
		if(this.fruitStock >= quantity) {
			this.fruitStock -= quantity;
			this.money += quantity * FruitSeller.FRUIT_PRICE;
		}
	}
}
