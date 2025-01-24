package jan_23th_asm;

public class Customer {
	private int quantity;
	private int money;
	
	public Customer(int quantity, int money) {
		this.quantity = quantity;
		this.money = money;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
