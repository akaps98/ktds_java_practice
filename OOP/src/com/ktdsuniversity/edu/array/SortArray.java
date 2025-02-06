package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] numbers = {56, 12, 58, 80, 1, 2};
		
		System.out.println(Arrays.toString(numbers));
		
		// bubble sort implementation
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - 1; j++) {
				if(numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
