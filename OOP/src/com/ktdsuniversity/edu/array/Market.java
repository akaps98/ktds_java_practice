package com.ktdsuniversity.edu.array;

public class Market {
	public static void main(String[] args) {
		Product mouse = new Product("Logitech mouse", 20000, 20);
		Product keyboard = new Product("Leopold keyboard", 35000, 10);
		Product monitor = new Product("LG monitor", 80000, 12);
		Product GPC = new Product("NVIDIA GPC", 16000, 5);
		
		Product[] selling = {mouse, keyboard, monitor, GPC};
		
		Seller seller = new Seller(selling);
		
		seller.sell("Leopold keyboard", 10);
		seller.sell("Leopold keyboard", 10);
	}
}
