package first_java_program;

public class Variables {
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE + 1);
		
		int intNumberVariable;
		intNumberVariable = Integer.valueOf("50");
		System.out.println(intNumberVariable);

		byte byteNumberVariable = Byte.MAX_VALUE;
		System.out.println(byteNumberVariable);

//		double doubleNumberVariable = 10.0;
		double doubleNumberVariable;
		doubleNumberVariable = Double.valueOf("10.0");
		System.out.println(doubleNumberVariable);
		
		byte firstNumber = 100;
		byte secondNumber = 110;
		byte thirdNumber = (byte) (firstNumber + secondNumber);
		System.out.println(thirdNumber);
		
		long hugeNumber = 1_000_000_000L;
		System.out.println(hugeNumber);
		
		float floatNumberVariable = 3.14f;
		System.out.println(floatNumberVariable);
		
		boolean isBigger = 3 > 1;
		System.out.println(isBigger);
		
		char letter = 'a' + 1;
		System.out.println(letter + 1);
	}
}
