package com.ktdsuniversity.edu.inheritance;

public class Apu extends Cpu {
	public Apu(String manufactor, String seriesNumber) {
		super(manufactor, seriesNumber);
	}
	
	public void draw() {
		System.out.println("그림을 그립니다................");
	}

	@Override // Super class의 calculate() 메소드를 재정의한다, 라고 정의하는 것
	public void calculate() {
		super.calculate();
		System.out.println("그림을 그리면서 2진수 계산도 합니다.");
		super.calculate();
	}
}
