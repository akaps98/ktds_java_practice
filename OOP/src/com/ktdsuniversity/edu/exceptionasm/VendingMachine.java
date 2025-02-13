package com.ktdsuniversity.edu.exceptionasm;

public class VendingMachine {
	private Product[] products;
	private int safe;
	private int currentInputMoney;
	
	public VendingMachine(Product[] products) {
		this.products = products;
	}
	
	public void refund(Customer customer) { // 환불하기; reusable method for 'returnProcess' method
		customer.refund(this.currentInputMoney);
	}
	
	public void returnProcess(Customer customer) { // reusable method for 'sell' method
		refund(customer); // refund for customer; customer.wallet += amountOfMoney
		this.currentInputMoney = 0; // reset currentInputMoney
	}
	
	public void sell(int productNumber, int amountOfMoney, Customer customer) { // 판매하기
	    try {
	        customer.doPayment(amountOfMoney); 
	        this.currentInputMoney += amountOfMoney;

	        if(this.products.length == 0) {
	            returnProcess(customer);
	            throw new NoProductException("ALL PRODUCTS ARE SOLD OUT!!\n");
	        }

	        for (int i = 0; i < this.products.length; i++) { // for문 사용
	            Product eachProduct = this.products[i];

	            if (eachProduct.getNumber() == productNumber) {
	                if (eachProduct.getRemainingDay() <= 0) {
	                    returnProcess(customer);
	                    throw new ExpiredProductException("SELECTED PRODUCT HAS BEEN EXPIRED!!\n");
	                }

	                if (eachProduct.getStockNumber() <= 0) { 
	                    returnProcess(customer);
	                    throw new SoldOutException("SELECTED PRODUCT HAS BEEN SOLD OUT!!\n");
	                }

	                if (eachProduct.getPrice() > amountOfMoney) {
	                    returnProcess(customer);
	                    throw new NeedMoreMoneyException("YOU NEED MORE MONEY!!\n");
	                }

	                System.out.println("YOU'VE PURCHASED " + eachProduct.getName() + "!!");
	                System.out.println("YOU'VE GOT " + (this.currentInputMoney - eachProduct.getPrice()) + " CHANGES BACK.\n");

	                customer.setWallet(customer.getWallet() + (amountOfMoney - eachProduct.getPrice()));
	                this.currentInputMoney = 0;

	                customer.getStock(eachProduct);

	                this.safe += eachProduct.getPrice();
	                eachProduct.setStock(eachProduct.getStockNumber() - 1);

	                return;
	            }
	        }


	        throw new NoProductException("INVALID PRODUCT ID\n");
	    } catch (ExceedMoneyException e) {
	        System.out.println(e.getMessage());
	        return;
	    } catch (NoProductException | ExpiredProductException | SoldOutException | NeedMoreMoneyException e) {
	        System.out.println(e.getMessage());
	    }
	}


	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("-----Vending Machine Status-----\n");
	    sb.append("Current safe: ").append(safe).append("\n");
	    sb.append("Products:\n");

	    for (Product product : products) {
            sb.append(product.toString()).append("\n");
	    }

	    return sb.toString();
	}
}
