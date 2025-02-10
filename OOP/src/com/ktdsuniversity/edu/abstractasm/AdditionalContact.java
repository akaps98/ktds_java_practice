package com.ktdsuniversity.edu.abstractasm;

public class AdditionalContact extends Contact {
    private String dateOfBirth;
    private String company;
    private String position;
    private String address;

    public AdditionalContact(int number, String name, String phoneNumber, String photo, String dateOfBirth, String company, String position, String address) {
        super(number, name, phoneNumber, photo);
        this.dateOfBirth = dateOfBirth;
        this.company = company;
        this.position = position;
        this.address = address;
    }
}

