package com.ktdsuniversity.edu.fruitseller;

public class Mart {
	public static void main(String[] args) {
		FruitSeller coupang = new FruitSeller(100, 1000);
		
		coupang.sell(10);
		coupang.sell(5);
		coupang.sell(3);
		coupang.sell(7);
		coupang.sell(9);
		
		System.out.println(coupang.getFruitStock());
		System.out.println(coupang.getMoney());
	}
}
