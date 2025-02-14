package com.ktdsuniversity.edu.fileioasm;

public class Contact {

	private int number;
	private String name;
	private String phoneNumber;
	private String profile;
	
	public Contact(int number, String name, String phoneNumber, String profile) {
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.profile = profile;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("No. " + this.number + "\n");
		sb.append("Name. " + this.name + "\n");
		sb.append("PhoneNumber. " + this.phoneNumber + "\n");
		sb.append("Profile. " + this.profile + "\n");
		return sb.toString();
	}
	
}
