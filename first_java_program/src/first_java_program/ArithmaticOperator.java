package first_java_program;

public class ArithmaticOperator {
	public static void main(String[] args) {
		int num1 = 1_500_000_000;
		long num2 = 1_500_000_000;
		System.out.println(((long)num1) + num2);
		
		int num3 = 10;
		int num4 = 3;
		System.out.println(num3 / num4);
		
		System.out.println(((double)num3) / num4);
		
		int num5 = 9;
		System.out.println(num5 % 2);
		
		// 셀프 연산
		// 스스로에게 연산하기 
		int count = 0;
		// count 변수의 값을 1 증가시키려면 ? 
		count += 1;
		count++;
		
		int count4 = 0;
		count4++; // 1
		count4--; // 0
	}
}
