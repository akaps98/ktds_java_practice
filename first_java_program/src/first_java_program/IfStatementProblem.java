package first_java_program;

public class IfStatementProblem {
	public static void main(String[] args) {
		// ex.1 
		int korScore = (int) (Math.random() * 51) + 50;
		int engScore = (int) (Math.random() * 51) + 50;
		int mathScore = (int) (Math.random() * 51) + 50;
		int progScore = (int) (Math.random() * 51) + 50;
		
		int sum = korScore + engScore + mathScore + mathScore;
		int average = sum / 4;
		
		System.out.println("ex1.");
		
		System.out.println("Average: " + average);
		
		if(average >= 95) {
			System.out.println("A+");
		} else if(average < 95 && average >= 90) {
			System.out.println("A");
		} else if(average < 90 && average >= 85) {
			System.out.println("B+");
		} else if(average < 85 && average >= 80) {
			System.out.println("B");
		} else if(average < 80 && average >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		// ex.2
		int money = 800_000;
		
		int father = (int) (Math.random() * 51) + 20;
		int mother = (int) (Math.random() * 51) + 20;
		int daughter = (int) (Math.random() * 26) + 5;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int totalFare = 0;
		
		if(father >= 19) {
			totalFare += adultOneWayFlightFare;
		} else {
			totalFare += kidOneWayFlightFare;
		}
		
		if(mother >= 19) {
			totalFare += adultOneWayFlightFare;
		} else {
			totalFare += kidOneWayFlightFare;
		}
		
		if(daughter >= 19) {
			totalFare += adultOneWayFlightFare;
		} else {
			totalFare += kidOneWayFlightFare;
		}
		
		System.out.println("\nex2.");
		
		System.out.println("Total fare: " + totalFare);
		
		if(money >= totalFare) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에 가자.");
		}
	}
}
