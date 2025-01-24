package jan_23th_asm;

public class Seller {
	private int quantity;
	private int money;
	private int price;
	
	public Seller(int quantity, int money, int price) {
		this.quantity = quantity;
		this.money = money;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
