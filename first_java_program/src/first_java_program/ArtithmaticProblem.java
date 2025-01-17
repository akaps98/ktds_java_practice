package first_java_program;

public class ArtithmaticProblem {
	public static void main(String[] args) {
		// 1

		/*
		 * 산술연산자를 이용
		 * mins와 secs의 값을 초로 변환해
		 * time에 할당 후 출력 
		 */
		
		int mins1 = 5;
		int secs1 = 50;
		int time1 = 0;
		
		time1 = (mins1 * 60) + secs1;
		System.out.println("ex1) Total time: " + time1 + " seconds");
		
		// 2
		
		/*
		 * 산술연산자를 이용
		 * processTime을 분, 초 를 구한뒤
		 * mins와 secs에 할당 후 출력 
		 */
		
		int processTime = 145;
		int mins2 = 0;
		int secs2 = 0;
		
		// 반복문 
//		while(true) {
//			processTime -= 60;
//			if(processTime < 0) {
//				secs2 = processTime + 60;
//				break;
//			}
//			mins2++;
//		}
		
		// 단순 연산
		mins2 = 145 / 60;
		secs2 = 145 % 60;
		
		System.out.println("ex2) Total mins: " + mins2 + ", total secs: " + secs2);
		
		// 3
		
		/*
		 * celsius를 fahrenheit로 변환 후 fahrenheit 출력
		 * 변환 공식: (celsius * 9 / 5) + 32
		 */
		
		double celsius = 33.3;
		double fahrenheit = 0;
		
		fahrenheit = celsius * 9 / 5 + 32;
		System.out.println("ex3) " + fahrenheit + " fahrenheit degree");
	}
}
