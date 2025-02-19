package com.ktuniversity.edu.stream.basic.map;

import java.util.ArrayList;
import java.util.List;

import com.ktuniversity.edu.stream.data.Dish;
import com.ktuniversity.edu.stream.data.DishList;

public class DishStream {
	public static void main(String[] args) {
		DishList.get()
				.stream()
				.map(ed -> ed.getName().length())
				.forEach(ed -> System.out.println(ed));
		
		System.out.println("-".repeat(50));
		
		List<String> letterList1 = new ArrayList<>();
		
		for(int i = 65; i < 91; i++) {
			letterList1.add(((char)i) + "");
		}
		
		letterList1.stream()
					.map(lt -> lt + " " + lt.toLowerCase())
					.forEach(lt -> System.out.println(lt));
		
		List<String> letterList2 = new ArrayList<>();
		
		for(int i = 65; i < 91; i++) {
			letterList2.add(((char)i) + "");
		}
		
//		letterList2.stream()
//				   .filter(lt -> lt.charAt(0) % 2 == 1)
//				   .forEach(lt -> System.out.println(lt));
		
		letterList2.stream()
				   .map(lt -> lt.charAt(0))
				   .filter(ascii -> ascii % 2 == 1)
				   .map(ascii -> ((char) ascii) + "")
				   .forEach(System.out::println); // method reference
		
		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.map(Dish::getType)
				.forEach(ed -> System.out.println(ed));

		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.map(ed -> ed.getCalories())
				.forEach(ed -> System.out.println(ed));

		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.map(ed -> ed.getType())
				.distinct()
				.forEach(ed -> System.out.println(ed));

		System.out.println("-".repeat(50));
		
		DishList.get()
				.stream()
				.map(ed -> ed.getCalories())
				.distinct()
				.forEach(ed -> System.out.println(ed));
		
		System.out.println("-".repeat(50));
	}
}
