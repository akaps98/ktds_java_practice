package com.ktdsuniversity.edu.barprob;

public class Customer {
	private int age;
	private int cash;
	private double drunkRate;
	private double fullRate;
	
	public Customer(int age, int cash, double drunkRate, double fullRate) {
		this.age = age;
		this.cash = cash;
		this.drunkRate = drunkRate;
		this.fullRate = fullRate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public double getDrunkRate() {
		return drunkRate;
	}

	public void setDrunkRate(double drunkRate) {
		this.drunkRate = drunkRate;
	}

	public double getFullRate() {
		return fullRate;
	}

	public void setFullRate(double fullRate) {
		this.fullRate = fullRate;
	}
	
	
}
