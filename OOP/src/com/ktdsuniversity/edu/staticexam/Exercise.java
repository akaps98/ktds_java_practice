package com.ktdsuniversity.edu.staticexam;

public class Exercise {
	public static boolean isValidAge(int age, int min, int max) {
		if(age > min && age < max) {
			return true;
		}
		return false;
	}
	
	public static double getCourseCredit(double average) {
		return average / 100 * 4.5;
	}
}
