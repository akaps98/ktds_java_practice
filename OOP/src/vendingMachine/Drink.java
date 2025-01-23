package vendingMachine;

public class Drink {
	public String name;
	public int price;
	public int quantity;
	
	public Drink() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	public Drink(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
}
