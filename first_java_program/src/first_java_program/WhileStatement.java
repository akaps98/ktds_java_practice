package first_java_program;

public class WhileStatement {
	public static void main(String[] args) {
		// 1. 1부터 10까지 출력.
		System.out.println("--------1--------");
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		// 2. 1부터 10까지 출력. (++)
		int num = 0;
		
		System.out.println("--------2--------");
		
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(++num);
		
		// 3. 1부터 10까지 출력. (while)
		int number = 0;
		
		System.out.println("--------3--------");
		
		while(number < 10) {
			System.out.println(++number);
		}
		
		// 4. 1부터 10까지 출력. (무한반복)
		int counter = 0;
		
		System.out.println("--------4--------");
		
		while(true) {
			System.out.println(++counter);
			// 반드시 종료 조건 명시
			if(counter == 10) {
				break;
			}
		}
	}
}
