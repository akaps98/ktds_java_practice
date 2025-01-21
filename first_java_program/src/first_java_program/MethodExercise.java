package first_java_program;

public class MethodExercise {
	public static void ex1() {
		// ex1
		
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		
		System.out.println("ex1 answer: " + sum1);
	}
	
	public static void ex2() {
		// ex2
		
		int sum2 = 0;
		
		for(int i = 1; i <= 100; i += 2) {
			sum2 += i;
		}
		
		System.out.println("ex2 answer: " + sum2);
	}
	
	public static void ex3() {
		// ex3
		
		int sum3 = 0;
		
		System.out.println("ex3 answer:");
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void ex4() {
		// ex4
		
		System.out.println("ex4 answer:");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static int rtEx1(int min, int sec) {
		return (min * 60) + sec;
	}
	
	public static int rtEx2_1(int processTime) {
		return processTime / 60;
	}
	
	public static int rtEx2_2(int processTime) {
		return processTime % 60;
	}
	
	public static int rtEx3(int celsius) {
		return celsius * 9 / 5 + 32;
	}
	
	public static int rtEx4_1(int korScore, int engScore, int mathScore, int progScore) {
		return korScore + engScore + mathScore + progScore;
	}
	
	public static int rtEx4_2(int sum, int count) {
		return sum / count;
	}
	
	public static String rtEx4_3(int avg) {
		if(avg >= 95) {
			return "A+";
		} else if(avg < 95 && avg >= 90) {
			return "A";
		} else if(avg < 90 && avg >= 85) {
			return "B+";
		} else if(avg < 85 && avg >= 80) {
			return "B";
		} else if(avg < 80 && avg >= 70) {
			return "C";
		} 
		return "F";
	}
	
	public static int rtEx5(int age) {
		if(age >= 19) {
			return 300_000;
		}
		return 120_000;
	}
	
	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
		ex4();
		
		System.out.println(rtEx1(72, 60));
		System.out.println(rtEx2_1(680));
		System.out.println(rtEx2_2(720));
		System.out.println(rtEx3(36));
		System.out.println(rtEx4_1(98, 95, 23, 40));
		System.out.println(rtEx4_2(rtEx4_1(98, 95, 23, 40), 4));
		System.out.println(rtEx4_3(rtEx4_2(rtEx4_1(98, 95, 23, 40), 4)));
		System.out.println(rtEx5(36));
		
		Benz cClass = new Benz("c-Class", "BENZ", 129712983, "2015/06/29");
		cClass.printInfo();
	}
}
