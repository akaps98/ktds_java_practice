package jan_23th_asm;

public class Q14 {
	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		
		num1 = 3.2f;
		num2 = 3.5f;
		num3 = 3.8f;
		
		float smaller = Math.min(num1, num2);
		float smallest = Math.min(smaller, num3);
		
		System.out.println(smallest);
	}
}
