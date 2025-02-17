package com.ktuniversity.edu.fp.builtin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExam {
	public static void main(String[] args) {
		Predicate<Integer> isOdd = (num) -> num % 2 == 1;
		
		boolean result = isOdd.test(325235);
		System.out.println(result);
		
//		List<Integer> numberArray = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		
//		numberArray.removeIf((element) -> element <= 5);
//		
//		System.out.println(numberArray);
		
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		
		List<String> a = strList.stream().filter((d) -> d.equals("b")).toList();
	}
}
