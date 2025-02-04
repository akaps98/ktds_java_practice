package com.ktdsuniversity.edu.staticexam;

import static com.ktdsuniversity.edu.staticexam.Car.INSTANCE_COUNT; // 웬만하면 쓰지말기; 다른 개발자들이 봤을때 어디서 가져온 상수 변수인지 알기 힘듬

public class CarMain {
	public static void main(String[] args) {
		System.out.println(INSTANCE_COUNT);
		
		Car car1 = new Car("lightweight");
		System.out.println(Car.INSTANCE_COUNT);
		
		Car car2 = new Car("heavy");
		System.out.println(Car.INSTANCE_COUNT);
	}
}
