package com.ktdsuniversity.edu.inheritance;

public class Contact {
	public String name;
	public String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Contact other) {
			if(this.name.equals(other.name) && this.phoneNumber.equals(other.phoneNumber)) {
				return true;
			}
		}
		return false;
	}
}
