package craneGame;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		if(dolls > 0) {
			isInsertCoin = true;
		} else {
			System.out.println("Out of dolls!");
		}
	}
	
	public int doGame() {
		if(isInsertCoin) {
			int gainedDoll = (int) (Math.random() * 2);
			if(gainedDoll == 0) {
				System.out.println("You've failed :P");
				return gainedDoll;
			} else {
				System.out.println("You've got a doll!");
				dolls--;
				isInsertCoin = !isInsertCoin;
				return gainedDoll;
			}
		} else {
			System.out.println("You haven't inserted a coin!");
			return 0;
		}
	}
}
