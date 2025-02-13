package com.ktdsuniversity.edu.exceptionasm;

public class ExpiredProductException extends RuntimeException {
	public ExpiredProductException(String msg) {
		super(msg);
	}
}
