package com.ktdsuniversity.edu.actractclass;

public class Human extends Animal {
	private String status;

	public Human(String place, String status) {
		super(place, 36.2);
		this.status = status;
	}

	@Override
	public void movement() {
		// TODO Auto-generated method stub
		super.temperature += 0.3;
		
		if(temperature <= 37.3) {
			this.status = "tired";
		} else {
			this.status = "sick";
		}
		
		System.out.println("This human is being " + this.status);
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		if(super.temperature > 36 && super.temperature < 37) {
			System.out.println("This human can breath.");
		} else {
			System.out.println("This human breaths toughly.");
		}
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.hungry += 10;
		
		if(super.hungry >= 100) {
			super.hungry = 100;
			System.out.println("This person cannot eat anymore.");
		} else {
			System.out.println("Tastes good");
		}
	}
	
	
}
