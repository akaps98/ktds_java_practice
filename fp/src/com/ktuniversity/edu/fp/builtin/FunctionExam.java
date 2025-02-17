package com.ktuniversity.edu.fp.builtin;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionExam {
	public static void main(String[] args) {
		Function<String, String> concat = (str) -> str + "?";
		
		System.out.println(concat.apply("하이용"));
		
		Function<String, Integer> fn = (str) -> str.length();
		
		System.out.println(fn.apply("안녕하세요, 지금은 함수형프로그래밍을 배우고 있습니다."));
		System.out.println(fn.apply("반갑습니다, 안녕하세요?"));
		
		Function<String, String[]> fn2 = (str) -> str.split(" ");
		
		System.out.println(Arrays.toString(fn2.apply("안녕하세요, 지금은 함수형 프로그래밍을 배우고 있습니다.")));
		System.out.println(Arrays.toString(fn2.apply("반갑습니다, 안녕하세요?")));
	}
}
