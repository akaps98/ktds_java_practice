package com.ktdsuniversity.edu.errorhandle;

public class HandleExceptionType {
	public static void main(String[] args) {
		loadClass("com.ktdsuniversity.edu.fruitseller");
	}
	
	public static void loadClass(String classPath) {
		try {
			Class.forName(classPath);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
