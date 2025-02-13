package com.ktdsuniversity.edu.exceptionasm;

public class SoldOutException extends RuntimeException {
	public SoldOutException(String msg) {
		super(msg);
	}
}
