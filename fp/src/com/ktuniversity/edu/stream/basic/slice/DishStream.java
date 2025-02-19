package com.ktuniversity.edu.stream.basic.slice;

import com.ktuniversity.edu.stream.data.DishList;
import com.ktuniversity.edu.stream.data.Type;

public class DishStream {
	public static void main(String[] args) {
		DishList.get()
				.stream()
				.skip(3)
				.forEach((eachDish) -> System.out.println(eachDish));
		
		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.limit(4)
		 		.forEach((eachDish) -> System.out.println(eachDish));
		
		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.limit(5)
				.skip(2)
				.forEach((eachDish) -> System.out.println(eachDish));
		
		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.skip(2)
				.limit(6)
				.forEach((eachDish) -> System.out.println(eachDish));
		
		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.filter((eachDish) -> eachDish.getType() == Type.MEAT)
				.limit(1)
				.forEach((eachDish) -> System.out.println(eachDish));
	}
}
