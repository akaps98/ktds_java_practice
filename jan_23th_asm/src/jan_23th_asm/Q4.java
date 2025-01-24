package jan_23th_asm;

public class Q4 {
	public static void main(String[] args) {
		checkPrimeNumber();
	}
	
	public static void checkPrimeNumber() {
		System.out.println(2);
		
		for(int i = 3; i <= 10000; i += 2) {
			int dividing = 2;
			boolean isPrime = true;
			while(true) {
				if(i % dividing == 0) {
					isPrime = false;
					break;
				}
				dividing++;
				if(dividing == i) {
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
