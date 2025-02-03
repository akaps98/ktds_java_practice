package jan_23th_asm;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 반복문장(for, while) 내부에서는 변수 선언을 자제
		int inputVal = 0;
		int i = 0;
		
		while(true) {
			inputVal = sc.nextInt();
			
			if(inputVal == -1) {
				System.out.println("Terminate the program.");
//				break;
				return;
			}
			
			for(i = 1; i <= 9; i++) {
				System.out.println(inputVal + " x " + i + " = " + inputVal * i);
			}
		}
	}
}
