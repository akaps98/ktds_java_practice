package com.ktdsuniversity.edu.staticexam;

public class Animal {
	// 멤버변수 = 인스턴스 변수 = 인스턴스로만 접근 가능
	private String name;
	private String birthDate;
	private int age;
	
	// 생성자 = 인스턴스 생성자 = 인스턴스를 만들어주는 메소드
	public Animal(String name, String birthDate, int age) {
		this.name = name;
		this.birthDate = birthDate;
		this.age = age;
	}
	
	// 메소드 = 인스턴스 메소드 = 인스턴스로만 호출할 수 있는 메소드
	public void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Birthdate: " + this.birthDate);
		System.out.println("Age: " + this.age);
	}
	
	public static Animal createNewAnimal(String name, String birthDate, int age) {
		return new Animal(name, birthDate, age);
	}
}
