package com.ktuniversity.edu.fp.basic;

public class Main {
	public static void main(String[] args) {
		// YesOrNo 익명클래스 만들기
		YesOrNo yn = new YesOrNo() {
			public boolean test(int value) {
				return value % 2 == 0;
			};
		};
		
		System.out.println(yn.test(9));
		System.out.println(yn.test(8));
		System.out.println(yn.test(1));
		System.out.println(yn.test(6));
		
		// 함수의 인풋은 타입을 생략할 수 있다
		YesOrNo ynFunction1 = (value) -> {
			return value % 2 == 0;
		};
		
		// 함수의 아웃풋도 생략 가능 
		YesOrNo ynFunction2 = (value) -> value % 2 == 0;
		
		System.out.println(ynFunction1.test(2));
		System.out.println(ynFunction1.test(3));
		
		FunctionParameter fp = new FunctionParameter();
		boolean isEven = fp.isEven(12, (value) -> value % 2 == 0);
		System.out.println(isEven);
		
		fp.isValidAge(300, (value) -> value < 120 && value >= 0);
		
		YesOrNo enough = fp.enoughMoney();
		System.out.println(enough.test(10000));
		
		Calculator simpleCalc = (n1, n2) -> {
			int result = n1 + n2;
			
			YesOrNo calcValidator = (value) -> value > 10000;
			calcValidator.test(result);
		};
		
		simpleCalc.calc(10000, 100001);
	}
}
