package com.ktdsuniversity.edu.arrayprob;

public class Q1 {
	public static void main(String[] args) {
		int numberOne = 10;
		int numberTwo = 20;
		
		// reverse number from numberTwo -> numberOne
		int tempNumber = numberOne;
		numberOne = numberTwo;
		numberTwo = tempNumber;
		
		System.out.println("numberOne: " + numberOne);
		System.out.println("numberTwo: " + numberTwo);
	}
}
