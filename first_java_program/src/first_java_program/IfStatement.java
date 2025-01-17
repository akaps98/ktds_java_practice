package first_java_program;

public class IfStatement {
	public static void main(String[] args) {
		// cost of coffee
		int coffee = 1500;
		
		// the money I have
		int myWallet = (int) (Math.random() * 10_000); // 0 ~ 9,999
		
		// the money friend has
		int friendWallet = (int) (Math.random() * 5_000); // 0 ~ 4,999
		
		// Could I afford 5 cups of coffee?
		boolean canBuy = coffee * 5 <= myWallet; // over 7,500
		
		System.out.println("The money I have currently: " + myWallet);
		System.out.println("The money friend have currently: " + friendWallet);
		
		System.out.println("Can I afford the coffee? " + canBuy);
		
		if(canBuy) {
			// If I could afford them, prints "The coffee has been ordered". Then, wallet - cost of coffee.
			System.out.println("The coffee has been ordered.");
			myWallet -= coffee * 5;
			System.out.println("Remaining: " + myWallet);
		} else {
			// If I could not afford them, prints "The money is insufficient". Then, cost of coffee - wallet.
			System.out.println("The money is insufficient.");
			int needMoney5 = (coffee * 5) - myWallet;
			int needMoney4 = (coffee * 4) - myWallet;
			if(friendWallet >= needMoney5) {
				System.out.println("The 5 cups of coffee has been ordered with borrowed money from friend.");
				int loan = (coffee * 5) - myWallet;
				System.out.println("Borrowed money: " + loan);
			} else if(friendWallet >= needMoney4) {
				System.out.println("The 4 cups of coffee has been ordered with borrowed money from friend.");
				int loan = (coffee * 4) - myWallet;
				System.out.println("Borrowed money: " + loan);
			} else {
				System.out.println("You need " + needMoney5 + " more.");
			}
		}
	}
}
