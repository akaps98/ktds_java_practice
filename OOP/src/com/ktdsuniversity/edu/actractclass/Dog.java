package com.ktdsuniversity.edu.actractclass;

/**
 * Animal 추상 클래스를 상속받아서
 * movement, breath, eat 추상 메소드를 구현시키는 "구현 클래스"로 작성
 * 
 * 상속받은 클래스가 추상 클래스라면
 * "구현 클래스"는 아래 두 케이스 중 하나를 선택해서 작성
 * 1. "구현 클래스"를 "추상 클래스"로 만든다.
 * 2. "구현 클래스"에서 "추상 메소드"를 모두 구현한다.
 */

public class Dog extends Animal {
	private String name;
	
	public Dog(String place, String name) {
		super(place, 37.5);
		this.name = name;
	}

	@Override
	public void movement() {
		super.temperature += 0.3;
		
		if(super.temperature >= 42) {
			super.temperature = 42;
		}
		
		System.out.println("Dog " + this.name + " is moving at " + super.place + " with its four legs and tail.");
		System.out.println("Alive?: " + super.isLive);
		System.out.println("Ego?: " + super.haveEgo);
	}

	@Override
	public void breath() {
		if(super.temperature >= 40) {
			System.out.println("개구호흡 중");
		} else {
			System.out.println("코로 호흡 중");
		}
		
		System.out.println("Current temperature is " + super.temperature);
		
		super.temperature -= 0.1;
		if(super.temperature <= 37.5) {
			super.temperature = 37.5;
		}
	}

	@Override
	public void eat() {
		if(super.hungry > 50) {
			System.out.println("Dog " + this.name + " is currently hungry.\nHave some snacks!");
		}
		
		super.hungry -= 10;
		
		if(super.hungry < 0) {
			super.hungry = 0;
		}
	}
}
