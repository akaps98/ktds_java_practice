package com.ktdsuniversity.edu.staticexam;

public class AnimalMain {
	public static void main(String[] args) {
		Animal cat1 = new Animal("춘봉", "2015-01-01", 10);
		cat1.printInfo(); // 인스턴스 메소드 호출
		Animal cat2 = Animal.createNewAnimal("첨지", "2016-01-01", 9);
		cat2.printInfo();
		
		Boolean isDecimal = NumberUtils.isDecimalFormat("23o957235");
		
		System.out.println(Exercise.getCourseCredit(60));
		System.out.println(Exercise.isValidAge(25, 10, 45));
	}
}
