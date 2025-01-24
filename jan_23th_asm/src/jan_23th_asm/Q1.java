package jan_23th_asm;

public class Q1 {
	public static void main(String[] args) {
		int curWallet = 10000;
		int fee = 18000;
		
		if(curWallet >= fee) {
			System.out.println("관람가능");
		} else {
			System.out.println("관람불가능");
		}
	}
}
