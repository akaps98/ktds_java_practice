package jan_23th_asm;

import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int enemyHealthPoint = sc.nextInt();
		
		while(true) {
			int attackDamage = (int) (Math.random() * 100) + 1;
			enemyHealthPoint -= attackDamage;
			
			System.out.println(attackDamage);
			
			if(enemyHealthPoint <= 0) {
				System.out.println("Victory!");
				break;
			}
		}
	}
}
