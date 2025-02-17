package com.ktuniversity.edu.fp.builtin;

import java.util.function.Consumer;

public class ConsumerExam {
	public static void main(String[] args) {
		Consumer<String> printFn = (str) -> {
			System.out.println(str);
		};
		
		printFn.accept("하이");
	}
}
