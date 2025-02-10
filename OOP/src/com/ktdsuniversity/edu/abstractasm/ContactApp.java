package com.ktdsuniversity.edu.abstractasm;

public class ContactApp implements ContactTool {
    private int size;
    private Contact[] contacts;

    public ContactApp(int contactMaxCount) {
        this.contacts = new Contact[contactMaxCount];
        this.size = 0;
    }

    @Override
    public void addNewContact(Contact contact) {
        this.contacts[size] = contact;
        this.size++;
    }

    @Override
    public Contact getContactAt(int contactIndex) {
        if(contactIndex > 0 && contactIndex < this.size) {
            return contacts[contactIndex];
        }
        return null; // exception handling
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (contacts[j].getNumber() > contacts[j + 1].getNumber()) {
                    Contact temp = contacts[j];
                    contacts[j] = contacts[j + 1];
                    contacts[j + 1] = temp;
                }
            }
        }
    }
}
