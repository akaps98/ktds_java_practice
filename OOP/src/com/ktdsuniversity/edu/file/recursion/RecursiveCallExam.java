package com.ktdsuniversity.edu.file.recursion;

/**
 * Recursive call (재귀호출)
 *   - 메소드가 자신을 다시 호출하는 것
 *   - a() 메소드 내부에서 a() 메소드를 다시 호출
 */

public class RecursiveCallExam {
	public static void main(String[] args) {
//		printHello();
//		System.out.println(factorial(5));
//		printNumbers(5);
		System.out.println(addAllNumbers(5));
	}
	
	public static void printHello() {
		System.out.println("Calling recursively...");
		
		int randomNumber = (int) (Math.random() * 10);
		System.out.println(randomNumber);
		
		if(randomNumber <= 5) {
			printHello();
		}
		
		return;
	}
	
	public static void printNumbers(int startNumber) {
		System.out.println(startNumber);
		
		startNumber--;
		
		if(startNumber < 0) {
			return;
		}
		
		printNumbers(startNumber);
	}
	
	public static int addAllNumbers(int startNumber) {
		if(startNumber == 0) {
			return 0;
		}
		
		return startNumber + (addAllNumbers(startNumber - 1));
	}
	
	public static int factorial(int n) {	
		if(n == 1) {
			return 1;
		}
		
		return n * (factorial(n - 1));
	}
}
