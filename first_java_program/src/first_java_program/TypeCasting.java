package first_java_program;

/**
 * 묵시적 환변환 실습
 */

public class TypeCasting {
	public static void main(String[] args) {
		// 1. int (4byte) 타입의 변수 정의 및 값 할당 
		int intNumber = Integer.MAX_VALUE;
		
		// 2. long (8byte) 타입의 변수 정의 및 값 할당 (int 타입의 값을 할당) 
		long longNumber = intNumber;
		
		// 3. 각 변수들의 값을 출력 
		System.out.println(intNumber);
		System.out.println(longNumber);
		
		// ===================================================================
		
		// 반대 케이스 실습 
		
		// 1. long (8byte) 타입의 변수 정의 및 값 할당 (30억 이상의 값 할당) 
		long longNumber2 = 3_000_000_000L;
		
		// 2. int (4byte) 타입의 변수 정의 및 값 할당 (int 타입의 값 할당)
		// int intNumber2 = longNumber2; // int의 바이트가 부족해서 에러 발생 
		// 묵시적 형변환이 불가, 개발자가 직접 형변환을 해야함 
		int intNumber2 = (int) longNumber2;
		
		// 3. 각 변수들의 값 출력 
		System.out.println(longNumber2);
		System.out.println(intNumber2);
		
		System.out.println("===================================================================");
		// ===================================================================
		
		// 정수 -> 부동소수점 
		int ex1num = 10;
		System.out.println("ex1) In case of Integer to Double: " + ((double) ex1num));
		System.out.println("ex1) In case of Integer to Float: " + ((float) ex1num));
		
		// 부동소수점 -> 정수  
		double ex2double = 12.3;
		float ex2float = 12.3f;
		System.out.println("ex2) In case of Double to Integer: " + ((double) ex2float));
		System.out.println("ex2) In case of Float to Integer: " + ((int) ex2float));
		
		// 부동소수점 소수점 처리 
		double ex3double = 3.14;
		float ex3float = 3.14f;
		System.out.println("ex3) In case of rouding up Double: " + Math.ceil(ex3double));
		System.out.println("ex3) In case of rouding up Float: " + Math.ceil(ex3float));
		System.out.println("ex3) In case of rouding Double: " + Math.round(ex3double));
		System.out.println("ex3) In case of rouding Float: " + Math.round(ex3float));
		
		// 부동소수점 소수점 올림처리  
		double ex4double = 5.56;
		float ex4float = 5.56f;
		System.out.println("ex4) In case of rouding up Double: " + Math.ceil(ex3double));
		System.out.println("ex4) In case of rouding up Float: " + Math.ceil(ex3float));
		
		// 문자열 -> 정수 변환 
		String ex5str = "25";
		System.out.println("ex5) In case of String to Integer: " + Integer.parseInt(ex5str));
		
		// 문자열 -> 정수 오류
		String ex6str = "25";
		//System.out.println("ex6) In case of String to Integer: " + (int)ex6str); // not able to cast String to int
		
		// 문자열 -> 부동소수점 변환 
		String ex7str = "25";
		System.out.println("ex7) In case of String to Double: " + Double.parseDouble(ex7str));
		System.out.println("ex7) In case of String to Float: " + Float.parseFloat(ex7str));
		
		// 문자열 -> 불린 변환 
		String ex8str1 = "true";
		String ex8str2 = "0";
		System.out.println("ex8) In case of String to Boolean: " + Boolean.parseBoolean(ex8str1));
		System.out.println("ex8) In case of String to Boolean: " + Boolean.parseBoolean(ex8str2));
		
		// 숫자를 문자로 변경하기
		// 1. 
		int age = 30;
		String ageString = String.valueOf(age);
		
		System.out.println(age + 1);
		System.out.println(ageString + 1);
		
		// 2.
		int count = 16;
		String countString = count + "";
		System.out.println(countString + 123);
		
		System.out.println(10/3.0);
	}
}
