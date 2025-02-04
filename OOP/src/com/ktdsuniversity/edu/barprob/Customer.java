package com.ktdsuniversity.edu.barprob;

public class Customer {
	private int age;
	private int cash;
	private double drunk_rate;
	private double full_rate;
	
	public Customer(int age, int cash, double drunk_rate, double full_rate) {
		this.age = age;
		this.cash = cash;
		this.drunk_rate = drunk_rate;
		this.full_rate = full_rate;
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

	public double getDrunk_rate() {
		return drunk_rate;
	}

	public void setDrunk_rate(double drunk_rate) {
		this.drunk_rate = drunk_rate;
	}

	public double getFull_rate() {
		return full_rate;
	}

	public void setFull_rate(double full_rate) {
		this.full_rate = full_rate;
	}
}
