package first_java_program;

public class Compare {
	public static void main(String[] args) {
		int a = 10;
		
		// a가 10보다 큰 수인가? 
		boolean isGreaterThan10 = a > 10;
		System.out.println("Does " + a + " is greater than 10? " + isGreaterThan10);
		
		// a가 20보다 작은 수인가?
		boolean isLessThan20 = a < 20;
		System.out.println("Does " + a + " is less than 20? " + isLessThan20);
		
		// a가 10보다 크고 20보다 작은 수인가?
		boolean isBetweenNumber = a > 10 && a < 20;
		System.out.println("Does " + a + " is greater than 10 and less than 20? " + isBetweenNumber);
		
		int b = (int) (Math.random() * 10);
		
		// b의 값이 짝수인가?
		boolean isEven = b % 2 == 0;
		System.out.println("Does " + b + " is even number? " + isEven);
		
		int c = (int) (Math.random() * 6); // 0 ~ 5
		
		// c의 값이 0보다 큰 짝수인가?
		boolean isGreaterEven = c % 2 == 0 && c > 0;
		System.out.println("Does " + c + " is greater than 0 and even number? " + isGreaterEven);
		
		int d = 35;
	
		// 변수 d의 값은 2 또는 5의 배수인가?
		boolean isMultiple20r5 = d % 2 == 0 || d % 5 == 0;
		System.out.println(isMultiple20r5);
		
		int son = 7;
		int parent = 40;
		
		// son은 부모님과 함께 12세 이상 관람가의 영화를 볼 수 있나?
		boolean isAvailable = parent >= 12 || son >= 12;
		System.out.println(isAvailable);
		
		int e = 35;
		
		// 변수 e의 값은 3의 배수가 아닌가?
		boolean isNotMultiple3 = e % 3 != 0;
		System.out.println(isNotMultiple3);
		
		isNotMultiple3 = !(e % 3 == 0);
		System.out.println(isNotMultiple3);
		
		int f = (int) (Math.random() * 100);
		
		// 변수 f의 값이 2 또는 3의 배수이면서 50보다 큰가?
		boolean isCheckF = f > 50 && (f % 2 == 0 || f % 3 == 0);
		System.out.print("f is " + f + ". ");
		System.out.println(isCheckF);
		
		int g = (int) (Math.random() * 1000);
		
		System.out.println("g is " + g + ". ");
		
		// exercise
		// 1. 변수 g가 3의 배수가 아닌가? (!=)
		boolean case1checkg = g % 3 != 0;
		System.out.println(case1checkg);
		
		// 2. 변수 g가 5의 배수가 아닌가? (not)
		boolean case2checkg = !(g % 5 == 0);
		System.out.println(case2checkg);
		
		// 3. 변수 g가 7의 배수 or 9의 배수가 아닌가? (!=)
		boolean case3checkg = g % 7 != 0 || g % 9 != 0;
		System.out.println(case3checkg);
		
		// 4. 변수 g가 7의 배수 or 9의 배수가 아닌가? (not)
		boolean case4checkg = !(g % 7 == 0 || g % 9 == 0);
		System.out.println(case4checkg);
	}
}
