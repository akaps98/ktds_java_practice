package vendingMachine;

public class Mart {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine(new Drink("baccus", 900, 15), new Drink("monster", 1500, 20), new Drink("hot6", 1300, 10), new Drink("milkis", 1400, 5));
		
		vm.pressItemButton("cass", 3); // invalid
		vm.pressItemButton("baccus", 3); // baccus 15 - 3 = 12
		vm.pressItemButton("monster", 7); // monster 20 - 7 = 13
		vm.pressItemButton("hot6", 1); // hot6 10 - 1 = 9
		vm.pressItemButton("milkis", 2); // milkis 5 - 2 = 3
		vm.pressItemButton("milkis", 5); // OUT OF STOCKS!; not able to order 5 of milkis due to the shortage of milkis quantity
		
		vm.stock("milkis", 3); // milkis 3 + 3 = 6
		vm.stock("monster", 10); // monster 13 + 10 = 23
		
		// If the codes work properly, total stocks - baccus: 12, monster: 23, hot6: 9, milkis: 6
		vm.showStock();
	}
}
