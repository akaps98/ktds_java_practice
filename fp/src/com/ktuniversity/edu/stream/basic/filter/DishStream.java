package com.ktuniversity.edu.stream.basic.filter;

import com.ktuniversity.edu.stream.data.DishList;

public class DishStream {
	public static void main(String[] args) {
		DishList.get()
				.stream()
				.peek((eachDish) -> System.out.println("Before filter: " + eachDish.getName() + "/" + eachDish.getIsVegetarian()))
				.filter((eachDish) -> eachDish.getIsVegetarian())
				.peek((eachDish) -> System.out.println("After filter: " + eachDish.getName() + "/" + eachDish.getIsVegetarian()))
				.forEach((eachDish) -> System.out.println(eachDish));
		
		DishList.get()
				.stream()
				.filter((ed) -> ed.getIsVegetarian())
				.filter((ed) -> ed.getCalories() < 300)
				.forEach((ed) -> System.out.println(ed));
	}
}
