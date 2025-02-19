package com.ktuniversity.edu.stream.collect.joining;

import java.util.stream.Collectors;

import com.ktuniversity.edu.stream.data.DishList;
import com.ktuniversity.edu.stream.data.Type;

public class DishStream {
	
	public String getOtherDishes() {
		// Collector에 수집 후 하나의 String으로 정제
		// "프렌치 프라이, 쌀밥, 계절과일, 피자"
		String otherDishes =
				DishList.get().stream() // List<Dish>
							  .filter(e -> e.getType() == Type.OTHER) // Stream<Dish>
							  .map(e -> e.getName()) // Stream<String>
							  .collect( Collectors.joining(", ") ); // String
		return otherDishes;
	}
	
	public String getLowFatDishes() {
		// 400 칼로리 이하의 음식들을 " - "로 구분해서 하나의 문자열로 만든다.
		String lowFatDishes =
				DishList.get().stream()
							  .filter(e -> e.getCalories() <= 400)
							  .map(e -> e.getName())
							  .collect(Collectors.joining(" - "));
		return lowFatDishes;
	}

	public static void main(String[] args) {

		DishStream ds = new DishStream();
		System.out.println( ds.getOtherDishes() );
		System.out.println( ds.getLowFatDishes() );
	}

}
