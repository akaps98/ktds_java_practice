package jan_23th_asm;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int inputVal = sc.nextInt();
			
			if(inputVal % 2 == 1 || inputVal < 0) {
				System.out.println("게임을 마칩니다");
				break;
			}
		}
	}
}
