package com.ktdsuniversity.edu.string;

public class HugeString {
	public static void main(String[] args) {
		String one = makeString();
		String two = makeString();
		String three = one + two;
		
		System.out.println(three);
	}
	
	public static String makeString() {
		String str = "";
		
		for(int i = 0; i < Short.MAX_VALUE * 100; i++) {
			str += "A";
		}
		
		return str;
	}
}
