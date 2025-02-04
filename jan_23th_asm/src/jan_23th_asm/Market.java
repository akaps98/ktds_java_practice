package jan_23th_asm;

public class Market {
	Customer customer;
	Seller seller;
	
	public Market(Customer customer, Seller seller) {
		this.customer = customer;
		this.seller = seller;
	}
	
	public void printResultInfo() {
		System.out.println(" ---------------------------------------\n"
						  +"|Customer's remaining quantity: " + this.customer.getQuantity() + "\n" 
						  +"|Customer's remaining money: " + this.customer.getMoney() + "\n" 
						  +" ---------------------------------------\n"
						  +"|Seller's remaining quantity: " + this.seller.getQuantity() + "\n" 
						  +"|Product price of seller: " + this.seller.getPrice() + "\n" 
						  +"|Seller's remaining money: " + this.seller.getMoney() + "\n" 
						  +" ---------------------------------------");
	}
	
	public void tradingProcess(int quantity, int beforeSelling, boolean isBigger) {
		if(isBigger) {
			this.customer.setMoney(this.customer.getMoney() - (this.seller.getQuantity() * this.seller.getPrice()));
			this.customer.setQuantity(this.customer.getQuantity() + this.seller.getQuantity());
			
			this.seller.setMoney(this.seller.getMoney() + (beforeSelling * this.seller.getPrice()));
			this.seller.setQuantity(0);
		} else {
			this.customer.setMoney(this.customer.getMoney() - (quantity * this.seller.getPrice()));
			this.customer.setQuantity(this.customer.getQuantity() + quantity);
			
			this.seller.setMoney(this.seller.getMoney() + (quantity * this.seller.getPrice()));
			this.seller.setQuantity(this.seller.getQuantity() - quantity);
		}
	}
	
	public void printTradingInfo(int quantity, int beforeSelling, boolean isBigger) {
		if(isBigger) {
			System.out.println("\nCustomer wanted to buy " + quantity
					  +"\nBut seller didn't have enough products..."
					  +"\nSeller decided to sell all of his product!"
					  +"\nCustomer has bought " + beforeSelling
			          +"\nTotal price is " + (beforeSelling * this.seller.getPrice())
					  +"\nThis product has been sold out!\n");
		} else {
			System.out.println("\nCustomer has bought " + beforeSelling
					          +"\nTotal price is " + (beforeSelling * this.seller.getPrice())
							  +"\nThis product has been sold out!\n");
		}
	}
	
	public void purchase(int quantity) {
		if(this.customer.getMoney() < this.seller.getPrice() * quantity) {
			System.out.println("\nCustomer cannot afford!\n");
		} else {
			if(quantity >= this.seller.getQuantity()) {
				boolean isBigger = quantity > this.seller.getQuantity();
				
				int beforeSelling = this.seller.getQuantity();
				
				tradingProcess(quantity, beforeSelling, isBigger);
				
				printTradingInfo(quantity, beforeSelling, isBigger);
			} else {
				tradingProcess(quantity, 0, false);
				
				System.out.println("\nCustomer has bought " + quantity
				          		  +"\nTotal price is " + (quantity * this.seller.getPrice())
				          		  +"\n");
			}
		}
		
		printResultInfo();
	}
	

	public static void main(String[] args) {
		String[] dd = new String[5];
		Customer customer = new Customer(7, 100000);
		Seller seller = new Seller(12, 3000, 1500);
		
		Market market = new Market(customer, seller);
		
		market.printResultInfo();
		
		market.purchase(10);
	}
}