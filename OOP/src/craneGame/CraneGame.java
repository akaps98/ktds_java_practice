package craneGame;

public class CraneGame {
	public static void main(String[] args) {
		CraneGameMachine CGM = new CraneGameMachine();
		
		CGM.dolls = 10;
		
		while(CGM.dolls > 0) {
			CGM.insertCoin();
			CGM.doGame();
			System.out.println("Remainings are " + CGM.dolls);
		}
		
		CGM.insertCoin();
		CGM.doGame();
	}
}
