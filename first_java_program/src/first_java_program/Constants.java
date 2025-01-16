package first_java_program;

/**
 * 상수를 정의하는 방법과 네이밍 규칙 
 */

public class Constants {
	public static void main(String[] args) {
		// constant의 naming convention: 모두 capital letters, 단어와 단어 사이에는 _로 구분 
		final int SPEED_OF_LIGHT = 299_792_458;
		
		// SPEED_OF_LIGHT = 100; constant에는 재할당 불가 
		
		final int LIMIT_AGE; // 값이 비어있는 상수 정의 
		
		LIMIT_AGE = 10; // 값이 비어있는 constant에는 최초 할당만 가능 
		
		// LIMIT_AGE = 20; // 값이 비어있는 constant에 이미 10을 할당했기에, 재할당 불가 
	}
}
