package com.ktdsuniversity.edu.fruitseller;

public class FruitSeller {
	/**
	 * 과일 단가
	 */
	private final int FRUIT_PRICE = 500;
	
	/**
	 * 과일 판매자의 소지금 (영업 준비금)
	 */
	private int money;
	
	/**
	 * 과일 판매자의 재고
	 */
	private int fruitStock;
	
	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitStock = fruitStock;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getFruitStock() {
		return fruitStock;
	}

	public void setFruitStock(int fruitStock) {
		this.fruitStock = fruitStock;
	}
	
	/**
	 * 과일을 판매
	 * 과일을 판매하면 판매개수만큼 재고가 줄고, 소지금 증가
	 * @param quantity
	 */
	public void sell(int quantity) {
		if(this.fruitStock >= quantity) {
			this.fruitStock -= quantity;
			this.money += this.FRUIT_PRICE * quantity;
		}
	}
}
