package com.ktuniversity.edu.stream.collect.tolist;

import java.util.List;
import java.util.stream.Collectors;

import com.ktuniversity.edu.stream.data.Dish;
import com.ktuniversity.edu.stream.data.DishList;
import com.ktuniversity.edu.stream.data.Type;

public class DishStream {
	public List<String> getOtherDishes() {
		List<String> otherDishes =
				DishList.get().stream() // List<Dish>
							  .filter(e -> e.getType() == Type.OTHER) // Stream<Dish>
							  .map(e -> e.getName()) // Stream<String>
							  .collect( Collectors.toList() ); // List<String>
		return otherDishes;
	}
	
	public List<Dish> getLowFatDishes() {
		List<Dish> lowFatDishes =
				DishList.get().stream()
							  .filter(e -> e.getCalories() <= 400)
//							  .map(e -> e.getName())
							  .collect(Collectors.toList());
		return lowFatDishes;
	}
	
	public List<Dish> getMenuWithoutFishType() {
		List<Dish> noFishDishes =
				DishList.get().stream()
							  .filter(e -> e.getType() != Type.FISH)
//							  .map(e -> e.getName())
							  .collect(Collectors.toList());
		return noFishDishes;
	}
	
	public List<String> getVegetableAndMeatMenu() {
		List<String> noVegeAndFishDishes =
				DishList.get().stream()
							  .filter(e -> e.getType() == Type.MEAT || e.getType() == Type.OTHER)
							  .map(e -> e.getName())
							  .collect(Collectors.toList());
		return noVegeAndFishDishes;
	}

	public static void main(String[] args) {

		DishStream ds = new DishStream();
		System.out.println( ds.getOtherDishes() );
		System.out.println( ds.getLowFatDishes() );
		System.out.println( ds.getMenuWithoutFishType() );
		System.out.println( ds.getVegetableAndMeatMenu() );
	}

}
