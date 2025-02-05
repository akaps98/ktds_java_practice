package com.ktdsuniversity.edu.array;

public class Seller {
	private Product[] products;

	public Seller(Product[] products) {
		this.products = products;
	}
	
	public void sell(String name, int quantity) {
		for(int i = 0; i < this.products.length; i++) {
			if(this.products[i].name.equals(name)) {
				if(quantity <= this.products[i].quantity || this.products[i].quantity < 0) {
					this.products[i].quantity -= quantity;
					System.out.println("You've bought " + quantity + " of " + name);
					return;
				} else {
					System.out.println("We cannot sell.");
					return;
				}
			}
		}
		
		System.out.println("Invalid product");
		return;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
}
