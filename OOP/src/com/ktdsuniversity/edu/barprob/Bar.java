package com.ktdsuniversity.edu.barprob;

public class Bar {
	public final static int DRINK_FEE = 3000;
	public final static int BEER_FEE = 5000;
	
	private final static double INCREASE_DRUNK_RATE = 0.5;
	private final static double INCREASE_FULL_RATE = 0.2;

	public void drink(String choice, Customer customer) {
		if(choice.trim().toLowerCase().equals("beer")) { // Input 'beer'
			if(customer.getCash() >= Bar.BEER_FEE) { // can afford
				if(!CustomerUtil.isDrunk(customer)) { // not drunken yet
					customer.setCash(customer.getCash() - Bar.BEER_FEE); // pay for beer
					customer.setDrunkRate(customer.getDrunkRate() + Bar.INCREASE_DRUNK_RATE); // increase drunk rate
					System.out.println("You've drunk beer!");
				} else { // already drunken
					System.out.println("You're drunk rate is currently " + customer.getDrunkRate() + "\nYou are drunken! We cannot sell beer anymore.");
					return;
				}
			} else { // cannot afford
				System.out.println("You don't have enough cash.");
				return;
			}
		} else if (choice.trim().toLowerCase().equals("drink")) { // input 'drink'
			if(customer.getCash() >= Bar.DRINK_FEE) { // can afford
				if(!CustomerUtil.isFull(customer)) { // not full yet
					customer.setCash(customer.getCash() - Bar.DRINK_FEE); // pay for drink
					customer.setFullRate(customer.getFullRate() + Bar.INCREASE_FULL_RATE); // increase full rate
					System.out.println("You've drunk drink!");
				} else { // already full
					System.out.printf("You're full rate is currently %.1f%n", + customer.getFullRate());
					System.out.println("You are full! We cannot sell drink anymore.\n");
					return;
				}
			} else { // cannot afford
				System.out.println("You don't have enough cash.");
				return;
			}
		} else { // input others from 'beer' or 'drink'
			System.out.println("Invalid drink.");
			return;
		}
		
		// print current information
		System.out.println("Your current cash: " + customer.getCash()
						  +"\nYour current drunk rate: " + customer.getDrunkRate());
		System.out.printf("Your current full rate: %.1f%n", customer.getFullRate());
		System.out.println();
	}


	public static void main(String[] args) {
		Bar bar = new Bar();
		Customer james = new Customer(23, 25000, 8.5, 15.9);
		
		bar.drink("drink", james);
		bar.drink("beer", james);
	}
}
