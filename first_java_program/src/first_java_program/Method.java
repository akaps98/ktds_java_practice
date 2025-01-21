package first_java_program;
import java.util.*;

public class Method {
	/**
	 * 숫자 두개를 랜덤하게 생성 후 더한 결과를 반환시키는데
	 * 숫자 중 하나라도 5보다 작은 숫자가 있다면 -1을 반환시킨다.
	 */
	public static int lessThanFive() {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		if(number1 < 5 || number2 < 5) {
			return -1;
		} else {
			return number1 + number2;
		}
	}
	
	public static void printNumbers() {
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
				return; // 반환타입이 void인 메소드에서 return은 메소드를 즉시 종료시킴.
			}
		}
	}
	
	/**
	 *  파라미터 X
	 *  임의의 두 숫자를 만들어서 값 할당 후, 두 숫자의 합을 반환시킨다.
	 */
	public static int returnSum() {
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		
		return number1 + number2;
	}
	
	/**
	 * 정수 파라미터 두 개를 받아서 첫번째 정수에 두번째 정수만큼 곱해서
	 * 문자열 파라미터와 함께 출력
	 * @param num 정수
	 * @param time 제곱할 횟수
	 * @param msg 결과와 함께 출력해주고 싶은 문자열
	 */
	public static void printPowerNumberWithMessage(int num, int time, String msg) {
		long result = 1;
		
		for(int i = 0; i < time; i++) {
			result *= num;
		}
		
		System.out.println(msg + result);
	}
	
	// int number -> 파라미터, argument, 인자 ==> 임시변수
	public static void printPowerNumber(int num) {
		// result -> 지역 변수
		int result = (int) Math.pow(num, 2);
		System.out.println(num + "의 제곱수는 " + result + "입니다.");
	}
	
	/**
	 * 정해진 숫자 두 개를 더해 출력하는 메소드
	 * 숫자를 더하는 방법과 출력하는 방법이 기술
	 */
	public static void add() {
		int number1 = 1;
		int number2 = 3;
		
		int addResult = number1 + number2;
		
		System.out.println(number1 + " + " + number2 + " = " + addResult);
	}
	
	/**
	 * 숫자를 담는 변수 두개에 임의의 값을 할당하고
	 * 두 숫자 중에서 더 큰 숫자만 출력한다.
	 */
	public static void isBigger() {
		int number1 = (int) (Math.random() * 10000);
		int number2 = (int) (Math.random() * 10000);
		
		if(number1 > number2) {
			System.out.println(number1 + " is bigger than " + number2);
		} else if (number2 > number1) {
			System.out.println(number2 + " is bigger than " + number1);
		} else {
			System.out.println("Same number.");
		}
	}
	
	/**
	 * 숫자 를 담는 변수 두개에 임의의 값을 할당하고
	 * 두 숫자를 뺐을 때 음수가 나오는 경우만 출력한다.
	 */
	public static void isNegative() {
		int number1 = (int) (Math.random() * 10000);
		int number2 = (int) (Math.random() * 10000);
		
		if(number1 - number2 < 0) {
			System.out.println(number1 - number2 + " is negative number.");
		} else if (number2 - number1 < 0) {
			System.out.println(number2 - number1 + " is negative number.");
		} else {
			System.out.println(number2 - number1 + " is zero.");
		}
	}
	
	/**
	 * 1부터 1000까지의 숫자중에 소수를 찾아서 출력
	 */
	public static void isPrimeNumber() {
		System.out.println(2);
		
		for(int i = 3; i <= 1000; i += 2) {
			int dividing = 2;
			boolean isPrime = true;
			while(true) {
				if(i % dividing == 0) {
					isPrime = false;
					break;
				}
				dividing++;
				if(dividing == i) {
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Method 클래스를 실행시키기 위한 특별한 메소드
	 * 이 메소드는 JVM이 실행
	 * @param args - main 메소드를 실행할 때 필요한 인자(파라미터)
	 */
	public static void main(String[] args) {
		System.out.println("메소드를 호출하는 코드입니다.");
//		add();
//		isBigger();
//		isNegative();
//		isPrimeNumber();
//		printPowerNumber(30);
//		printPowerNumberWithMessage(10, 5, "The result is ");
		System.out.println(returnSum());
		System.out.println(lessThanFive());
	}
}
