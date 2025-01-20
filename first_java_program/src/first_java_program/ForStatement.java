package first_java_program;

public class ForStatement {
	public static void main(String[] args) {
		// 1. 1부터 10까지 출력하기
		System.out.println("--------1--------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 2. 1부터 10사이에 있는 홀수만 출력하기
		System.out.println("--------2--------");
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		// 3. 2부터 100,000사이에 있는 짝수만 출력하기
		System.out.println("--------3--------");
//		
//		for(int i = 2; i <= 100_000; i += 2) {
//			System.out.println(i);
//		}
		
		// 구구단
		for(int i = 2; i < 10; i ++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		
		// 연습문제
		
		System.out.println("--------ex--------");
		
		// ex1
		
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		
		System.out.println("ex1 answer: " + sum1);
		
		
		// ex2
		
		int sum2 = 0;
		
		for(int i = 1; i <= 100; i += 2) {
			sum2 += i;
		}
		
		System.out.println("ex2 answer: " + sum2);
		
		// ex3
		
		int sum3 = 0;
		
		System.out.println("ex3 answer:");
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
		
		// ex4
		
		System.out.println("ex4 answer:");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// additional exercise
		// get sum of each digit (ex. 7145 => 7 + 1 + 4 + 5 = 17)
		
		int sum4 = 0;
		int num = 111012312;
		String strNum = String.valueOf(num);
		
		for(int i = 0; i < strNum.length(); i++) {
			sum4 += Integer.valueOf(strNum.charAt(i) - 48);
		}
		
		System.out.println("additional exercise's answer: " + sum4);
		
		System.out.println("How many digits of '" + num + "'?: " + strNum.length());
	}
}
