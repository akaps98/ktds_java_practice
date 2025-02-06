package com.ktdsuniversity.edu.arrayprob;

public class Q2 {
	public static void main(String[] args) {
		int[] numArr = {10, 5, 20, 4};
		
		// reverse number from numArr[1] -> numArr[0]
		int tempNum = numArr[1];
		numArr[1] = numArr[0];
		numArr[0] = tempNum;
		
		// reverse number from numArr[1] -> numArr[0]
		tempNum = numArr[3];
		numArr[3] = numArr[2];
		numArr[2] = tempNum;
		
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
