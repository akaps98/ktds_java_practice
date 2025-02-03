package jan_23th_asm;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while(true) {
			str = sc.next();
			
			double result = calculation(str, 3, 5);
			
			if(result == 0) {
				System.out.println("Terminate calculation.");
				break;
			} else if (result == -1) {
				System.out.println("Invalid.\nInput another.");
			} else {
				System.out.println(result);
			}
		}
	}
	
	public static double calculation(String str, double num1, double num2) {
		if(str.equals("+")) {
			return num1 + num2;
		} else if(str.equals("-")) {
			return num1 - num2;
		} else if(str.equals("*")) {
			return num1 * num2;
		} else if(str.equals("/")) {
			return num1 / num2;
		} else if(str.equals("exit")){
			return 0;
		} else {
			return -1;
		}
	}
}
