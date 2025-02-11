package com.ktdsuniversity.edu.abstractasm;

import com.ktdsuniversity.edu.abstractasm.exception.ContactNotFoundException;
import com.ktdsuniversity.edu.abstractasm.exception.ContactOutOfBoundsException;
import com.ktdsuniversity.edu.abstractasm.exception.NullContactException;

public class ContactApp implements ContactTool {
    private int size;
    private Contact[] contacts;

    public ContactApp(int contactMaxCount) {
        this.contacts = new Contact[contactMaxCount];
        this.size = 0;
    }

    @Override
    public void addNewContact(Contact contact) {
        this.contacts[this.size] = contact; // do not forget to utilize 'this'
        this.size++;
    }

    @Override
    public Contact getContactAt(int contactIndex) {
        if (contactIndex < 0 || contactIndex >= contacts.length) {
            throw new ContactOutOfBoundsException("Index " + contactIndex + " is out of bounds.");
        }

        if (contactIndex >= this.size) {
            throw new ContactNotFoundException("No contact found at index " + contactIndex);
        }

        if (contacts[contactIndex] == null) {
            throw new NullContactException("Contact at index " + contactIndex + " is null.");
        }

        return contacts[contactIndex];
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
