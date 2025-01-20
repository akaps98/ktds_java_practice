package first_java_program;

import java.util.Scanner;

public class UpDownGame2 {
	public static void main(String[] args) {
		int quiz = (int) (Math.random() * 100) + 1;
		
		int count = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("정답입니다.");
				break;
			}
			count++;
			
			if(count == 3) {
				System.out.println("3회 오답으로 게임을 종료합니다.\n정답은 " + quiz + "였네요 :P");
				break;
			}
			
			if(quiz > answer) {
				System.out.println("UP!");
			} else {
				System.out.println("DOWN!");
			}
		}
	}
}