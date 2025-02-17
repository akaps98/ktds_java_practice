package com.ktuniversity.edu.stream.basic;

//import java.util.stream.Stream;
//
//import com.ktuniversity.edu.stream.data.Dish;
import com.ktuniversity.edu.stream.data.DishList;

public class BasicStream {
	public void printMenuStream() {
//		Stream<Dish> dishStream = DishList.get().stream();
//		dishStream.forEach(eachDish -> System.out.println(eachDish));
		DishList.get().forEach(eachDish -> System.out.println(eachDish));
	}
	
	public void printMenuNotStream() {
		DishList.get().forEach(dish -> System.out.println(dish.toString()));
	}
	
	public static void main(String[] args) {
		BasicStream bs = new BasicStream();
		bs.printMenuNotStream();
		bs.printMenuStream();
	}
}
