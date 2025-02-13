package com.ktdsuniversity.edu.exceptionasm;

public class Customer {
	private int wallet;
	private Product[] shoppingCart;
	private int currentIdx;
	
	public Customer(int wallet, int maxNumberOfProducts) {
		this.wallet = wallet;
		this.shoppingCart = new Product[maxNumberOfProducts];
	}
	
	public void doPayment(int payMoney) throws ExceedMoneyException { // 지불하기
	    if (this.wallet < payMoney) { // cannot afford
	        throw new ExceedMoneyException("You can't afford!");
	    }
	    this.wallet -= payMoney; // payment process has been successed
	}

	
	public void getStock(Product product) { // 상품받기
		if(currentIdx == 0) { // no product in shopping cart
			this.shoppingCart[currentIdx] = product;
			currentIdx++;
			return;
		}
        try {
            if (this.currentIdx >= shoppingCart.length) {
                throw new ExceedCartException("Your shopping cart is full, cannot buy more products!");
            }

            boolean isExist = false; // check the product is already added

            for (int i = 0; i < currentIdx; i++) {
                if (shoppingCart[i].getNumber() == product.getNumber()) {
                    shoppingCart[i].setStock(shoppingCart[i].getStockNumber() + 1);
                    System.out.println("Stock increased for " + shoppingCart[i].getName() + ": " + shoppingCart[i].getStockNumber());
                    isExist = true;
                    break;
                }
            }

            if (isExist) {
            	return;
            } else {
                shoppingCart[currentIdx] = product;
                currentIdx++; 
            }
        } catch (ExceedCartException | SoldOutException e) {
            System.out.println(e.getMessage());
        }
    }

	public void refund(int refundMoney) { // 지급받기
		this.wallet += refundMoney;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Your current wallet: ").append(wallet).append("\n");
	    sb.append("Shopping Cart:\n");
	    
	    if(this.currentIdx == 0) { // no product in shopping cart
	    	sb.append("No products in your shopping cart!\n");
	    } else { // sth in shopping cart
		    for(int i = 0; i < this.currentIdx; i++) {
	            sb.append(this.shoppingCart[i].toString()).append("\n");
		    }
	    }
	    
	    return sb.toString();
	}
	
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	public int getWallet() {
		return this.wallet;
	}
	
	public Product[] getShoppingCart() {
		return this.shoppingCart;
	}
	
	public int getCurrnetIdx() {
		return this.currentIdx;
	}
} 
