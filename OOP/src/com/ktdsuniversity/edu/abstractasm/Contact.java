package com.ktdsuniversity.edu.abstractasm;

public class Contact {
    private int number;
    private String name;
    private String phoneNumber;
    private String photo;

    public Contact(int number, String name, String phoneNumber, String photo) {
        this.number = number;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
    }

    public int getNumber() {
        return this.number;
    }
}
