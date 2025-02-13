package com.ktdsuniversity.edu.exceptionasm;

public class Main {
	public static void main(String[] args) {
		Customer tony = new Customer(1500, 2);
//		System.out.println(tony.toString());
		
		Product tissue = new Product(1, "Tissue for travel", 200, 2, 3);
		Product drink = new Product(2, "Milkis", 200, 2, 3);
		Product pen = new Product(3, "Good pen", 150, 3, 3);

		Product[] currentProducts = {tissue, drink, pen};
		VendingMachine vm = new VendingMachine(currentProducts);
		
		vm.sell(2, 500, tony);
//		System.out.println(tony.toString()); 
//		System.out.println(tony.toString());
//		System.out.println(vm.toString());
//		System.out.println(tony.toString());
//		vm.sell(1, 500, tony);
//		System.out.println(tony.toString());
//		System.out.println(tony.toString());
//		System.out.println(vm.toString());
//		vm.sell(1, 500, tony);
//		System.out.println(tony.toString());
//		System.out.println(tony.toString());
//		System.out.println(vm.toString());
		vm.sell(3, 500, tony);
		vm.sell(3, 500, tony);
		System.out.println(tony.toString());
//		vm.sell(3, 500, tony);
		System.out.println(vm.toString());
//		vm.sell(1, 500, tony);
//		System.out.println(tony.toString());
	}
}
