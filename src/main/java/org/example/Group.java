package org.example;

import java.util.HashMap;

public class Group {
    private String title;

    /**
     * k: phone number, value: contact
     */
    private HashMap<String, Contact> contacts;


    public Group(String title) {
        this.title = title;
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        this.contacts.put(contact.getPhoneNumber(), contact);
    }

    public void showContacts() {
        System.out.println("Group: " + title);
        System.out.println(contacts.values().toString());
    }

    /**
     * find contact by phone
     */
    public Contact findContact(String phone) {
        return contacts.get(phone);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + contacts;
    }
}
