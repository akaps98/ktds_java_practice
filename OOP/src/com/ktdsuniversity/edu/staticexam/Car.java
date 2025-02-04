package com.ktdsuniversity.edu.staticexam;

public class Car {
	// 클래스 변수(스태틱 변수)
	// OOP 프로젝트 내부 어디서나 접근 가능한 클래스 변수
	// com.ktdsuniversity.edu.staticexam.Car.instanceCount
//	public static int instanceCount;
	
	// 클래스 상수(스태틱 상수)
	// OOP 프로젝트 내부 어디서나 접근 가능한 클래스 상수
	public final static int INSTANCE_COUNT = 10;
	
	// 인스턴스 변수(멤버 변수)
	private String name;

	public Car(String name) {
//		this.instanceCount++; // should be accessed in a static way -> don't use
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
