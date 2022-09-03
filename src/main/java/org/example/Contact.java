package org.example;

public class Contact {
    private String phoneNumber;
    private String name;

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return phoneNumber + ": " + name;
    }
}
