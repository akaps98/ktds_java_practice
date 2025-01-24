package jan_23th_asm;

public class Q13 {
	public static void main(String[] args) {
		float num1;
		float num2;
		
		num1 = 3.2f;
		num2 = 3.5f;
		
		float bigger;
		
		if(num1 > num2) {
			bigger = num1;
		} else {
			bigger = num2;
		}
		
		System.out.println(bigger);
	}
}
