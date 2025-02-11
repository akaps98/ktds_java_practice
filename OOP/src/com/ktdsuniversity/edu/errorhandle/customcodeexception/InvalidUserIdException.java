package com.ktdsuniversity.edu.errorhandle.customcodeexception;

public class InvalidUserIdException extends RuntimeException {
	public InvalidUserIdException(String msg) {
		super(msg);
	}
}
