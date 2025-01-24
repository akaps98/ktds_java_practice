package jan_23th_asm;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int inputVal = sc.nextInt();
			
			if(inputVal == -1) {
				System.out.println("Terminate the program.");
				break;
			}
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(inputVal + " x " + i + " = " + inputVal * i);
			}
		}
	}
}
