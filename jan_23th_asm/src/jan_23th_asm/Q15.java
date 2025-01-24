package jan_23th_asm;

import java.util.*;

public class Q15 {
	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		float num4;
		float num5;
		
		num1 = 3.2f;
		num2 = 3.5f;
		num3 = 3.8f;
		num4 = 4.1f;
		num5 = 4.6f;
	
		float average = (num1 + num2 + num3 + num4 + num5) / 5;
		
		if(num1 > average) {
			System.out.println(num1);
		}
		
		if(num2 > average) {
			System.out.println(num2);
		}
		
		if(num3 > average) {
			System.out.println(num3);
		}
		
		if(num4 > average) {
			System.out.println(num4);
		}
		
		if(num5 > average) {
			System.out.println(num5);
		}
	}
}
