package com.ktdsuniversity.edu.staticexam;

/**
 * 	숫자와 관련된 유틸리티 메소드를 관리하는 클래스
 * 	예) 문자 => 숫자
 * 		문자가 숫자로만 이루어져있는지 확인
 * 		문자가 실수로만 이루어져있는지 확인
 * 		숫자 => 문자
 */

public class NumberUtils {
	public static int convertToInt(String source) {
		return Integer.parseInt(source);
	}
	
	public static int convertToInt(String source, int defaultValue) {
		if(NumberUtils.isDecimalFormat(source)) {
			return NumberUtils.convertToInt(source);
		}
		return defaultValue;
	}
	
	public static boolean isDecimalFormat(String source) {
		return source.matches("^[0-9]+$");
	}
}
