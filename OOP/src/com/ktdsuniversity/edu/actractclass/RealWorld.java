package com.ktdsuniversity.edu.actractclass;

public class RealWorld {
	public static void main(String[] args) {
		Animal dog = new Dog("house", "BBUGGU");
		behavior(dog);
	}
	
	public static void behavior(Animal animal) {
		animal.movement();
		animal.breath();
		animal.eat();
	}
}
