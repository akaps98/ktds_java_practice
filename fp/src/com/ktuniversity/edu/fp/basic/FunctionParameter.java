package com.ktuniversity.edu.fp.basic;

public class FunctionParameter {
	public boolean isValidAge(int age, YesOrNo yesOrNo) {
		System.out.println(age + "는 " + (yesOrNo.test(age) ? "정상적인 " : "잘못된 ") + "나이 입니다.");
		return yesOrNo.test(age);
	}
	
	public boolean isEven(int number, YesOrNo yesOrNo) {
		System.out.println(number + "는 " + (yesOrNo.test(number) ? "짝" : "홀") + "수 입니다.");
		return yesOrNo.test(number);
	}
	
	public YesOrNo enoughMoney() {
		return (value) -> value >= 5000;
	}
}
