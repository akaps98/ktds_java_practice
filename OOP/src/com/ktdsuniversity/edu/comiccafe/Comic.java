package com.ktdsuniversity.edu.comiccafe;

public class Comic {
	private String title;
	private boolean isBorrowed;
	
	public Comic() {
		this.title = "";
		this.isBorrowed = false;
	}
	
	public Comic(String title) {
		this.title = title;
		this.isBorrowed = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean getIsBorrowed() {
		return isBorrowed;
	}

	public void setIsBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
}
