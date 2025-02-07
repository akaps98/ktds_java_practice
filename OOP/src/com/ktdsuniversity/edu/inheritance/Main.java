package com.ktdsuniversity.edu.inheritance;

public class Main {
	public static void main(String[] args) {
		Contact contact = new Contact("강준식", "010-1234-1234");
		Contact otherContact = new Contact("강준식", "010-1234-1234");

		System.out.println(contact == otherContact);
		System.out.println(contact.equals(otherContact));
		
		Contact contact1 = new Contact("홍길동", "010-4231-1422");
		Contact contact2 = new Contact("대길이", "010-3455-5822");
	}
}
