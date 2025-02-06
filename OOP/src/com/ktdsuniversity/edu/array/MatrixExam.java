package com.ktdsuniversity.edu.array;

public class MatrixExam {
	public static void variableMatrix() {
		int[][] matrix = new int[4][];
	}
	
	public static void matrix() {
		int[][] matrix = new int[5][5];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = j + 1;
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(i + "번째 배열 정보");
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		matrix();
	}
}
