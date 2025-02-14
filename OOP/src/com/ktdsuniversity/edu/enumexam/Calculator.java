package com.ktdsuniversity.edu.enumexam;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(calc(OperType.ADD, 2, 3));
	}
	
	public static int calc(OperType operator, int n1, int n2) {
		return switch(operator) {
			case OperType.ADD -> n1 + n2;
			case OperType.SUB -> n1 - n2;
			case OperType.MUL -> n1 * n2;
			case OperType.DIV -> n1 / n2;
			default -> 0;
		};
	}
}
