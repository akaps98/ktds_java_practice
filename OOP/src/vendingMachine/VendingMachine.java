package vendingMachine;

public class VendingMachine {
	Drink baccus;
	Drink monster;
	Drink hot6;
	Drink milkis;
	s
	public VendingMachine(Drink baccus, Drink monster, Drink hot6, Drink milkis) {
		this.baccus = baccus;
		this.monster = monster;
		this.hot6 = hot6;
		this.milkis = milkis;
	}
	
	public Drink pressItemButton(String drinkName, int orderCount) {
		if(drinkName.equals(this.baccus.name)) {
			if(this.baccus.quantity >= orderCount) {
				this.baccus.quantity -= orderCount;
				return new Drink(this.baccus.name, this.baccus.price, orderCount);
			} else {
				System.out.println("Out of stock!");
				return null;
			}
		} else if(drinkName.equals(this.monster.name)) {
			if(this.monster.quantity >= orderCount) {
				this.monster.quantity -= orderCount;
				return new Drink(this.monster.name, this.monster.price, orderCount);
			} else {
				System.out.println("Out of stock!");
				return null;
			}
		} else if(drinkName.equals(this.hot6.name)) {
			if(this.hot6.quantity >= orderCount) {
				this.hot6.quantity -= orderCount;
				return new Drink(this.hot6.name, this.hot6.price, orderCount);
			} else {
				System.out.println("Out of stock!");
				return null;
			}
		} else if(drinkName.equals(this.milkis.name)) {
			if(this.milkis.quantity >= orderCount) {
				this.milkis.quantity -= orderCount;
				return new Drink(this.milkis.name, this.milkis.price, orderCount);
			} else {
				System.out.println("Out of stock!");
				return null;
			}
		}
		System.out.println("Invalid!");
		return null;
	}
	
	public void stock(String drinkName, int orderedStock) {
		if(drinkName.equals(this.baccus.name)) {
			this.baccus.quantity += orderedStock;
		} else if(drinkName.equals(this.monster.name)) {
			this.monster.quantity += orderedStock;
		} else if(drinkName.equals(this.hot6.name)) {
			this.hot6.quantity += orderedStock;
		} else if(drinkName.equals(this.milkis.name)) {
			this.milkis.quantity += orderedStock;
		} else {
			System.out.println("Invalid!");
		}
	}
	
	public void showStock() {
		System.out.println("OUR STOCKS\n------------------------------------\n"
							+ this.baccus.name + ": " + this.baccus.quantity + "\n"
							+ this.monster.name + ": " + this.monster.quantity + "\n"
							+ this.hot6.name + ": " + this.hot6.quantity + "\n"
							+ this.milkis.name + ": " + this.milkis.quantity);
	}
}
