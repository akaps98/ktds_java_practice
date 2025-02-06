package com.ktdsuniversity.edu.arrayprob;

public class Q3 {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// right-most number from numArr
		int reverseNum = numArr[numArr.length - 1];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = reverseNum; // reverse number
			reverseNum--; // decreasing by 1 until the for-loop is finished
		}
		
		// print out numArr
		for(int i = 0; i < numArr.length; i++) {
			if(i == numArr.length - 1) { // exclude comma
				System.out.print(numArr[i]);
				break;
			}
			System.out.print(numArr[i] + ", ");
		}
	}
}
