package com.ktdsuniversity.edu.string;

import java.util.Scanner;

public class StringExam {
	public static void main(String[] args) {
//		printFileName();
//		ex1();
		ex3();
	}
	
	public static void printFileName() {
		String path = "C:\\devprograms\\eclipse-workspace\\eclipse.exe";

		String ex1 = path.substring(path.lastIndexOf("\\") + 1);
		System.out.println(ex1);
		
		String ex2 = ex1.substring(0, ex1.indexOf('.'));
		System.out.println(ex2);
		
		String ex3 = "eclipse.copy.exe";
        int start = ex3.indexOf(".") + 1;
        int end = ex3.lastIndexOf(".");

        String result = ex3.substring(start, end);
        System.out.println(result);
	}
	
	public static void ex1() {
		Scanner sc = new Scanner(System.in);
		
		String word = "자전거";
		
		System.out.println("시작 단어는 " + word);
		
		while(true) {
			System.out.println(word);
			String inputWord = sc.nextLine().trim();
			
			if(inputWord.length() < 3 || inputWord.charAt(0) != word.charAt(word.length() - 1)) {
				System.out.println("You lose");
				return;
			}
			
			word = inputWord;
		}
	}
	
	public static void ex2() {
		Scanner sc = new Scanner(System.in);
		
		String word = "나";
	    int count = 0;
		
	    System.out.println("'" + word + "'" + " 로 시작하는 단어 입력하기(두 글자 이상)");
		
		while(true) {
			String inputWord = sc.nextLine().trim();
			
			if(inputWord.length() < 2 || inputWord.charAt(0) != word.charAt(0)) {
				System.out.println("You lose");
				System.out.println("Score:" + count);
				return;
			}
			
			count++;
		}
	}
	
	public static void ex3() {
		Scanner sc = new Scanner(System.in);
		
		String word = "기";
	    int count = 0;
		
		System.out.println("'" + word + "'" + " 로 끝나는 단어 입력하기(두 글자 이상)");
		
		while(true) {
			String inputWord = sc.nextLine().trim();
			
			if(inputWord.length() < 2 || inputWord.charAt(inputWord.length() - 1) != word.charAt(0)) {
				System.out.println("You lose");
				System.out.println("Score:" + count);
				return;
			}
			
			count++;
		}
	}
}
