package jan_23th_asm;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputVal = sc.nextInt();
		
		System.out.println(isPrime(inputVal));
	}
	
	public static boolean isPrime(int num) {
		int dividing = 2;
		boolean isPrime = true;
		
		if(num == 1) {
			return false;
		} else if(num == 2 || num == 3) {
			return true;
		}
	
		while(true) {
			if(num % dividing == 0) {
				isPrime = false;
				break;
			}
			dividing++;
			if(dividing == num) {
				break;
			}
		}
		return isPrime;
	}
}
