package com.ktuniversity.edu.stream.find.match;

import com.ktuniversity.edu.stream.data.Dish;
import com.ktuniversity.edu.stream.data.DishList;
import com.ktuniversity.edu.stream.data.Type;

public class DishStream {
	public static void main(String[] args) {
		System.out.println(DishList.get()
								   .stream()
								   .anyMatch(Dish::getIsVegetarian));
		
		System.out.println(DishList.get()
								   .stream()
								   .filter(ed -> ed.getType() == Type.MEAT)
								   .anyMatch(ed -> ed.getCalories() < 300));
		
		System.out.println(DishList.get()
								   .stream()
								   .allMatch(ed -> ed.getIsVegetarian()));
		
		System.out.println(DishList.get()
								   .stream()
								   .filter(ed -> ed.getType() == Type.FISH)
								   .allMatch(ed -> ed.getCalories() < 500));
		
		System.out.println(DishList.get()
								   .stream()
								   .filter(ed -> ed.getType() == Type.FISH)
								   .allMatch(ed -> ed.getCalories() >= 500));
		
		System.out.println(DishList.get()
								   .stream()
								   .noneMatch(Dish::getIsVegetarian));
	}
}
