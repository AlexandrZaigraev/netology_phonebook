package org.example;

import java.util.ArrayList;

public class Group {
    private String title;

    private ArrayList<Contact> contactsList;

    public Group(String title) {
        this.title = title;
        this.contactsList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.contactsList.add(contact);
    }

    public void showContacts() {
        System.out.println("Group: " + title);
        contactsList.forEach(i-> System.out.println(i));
    }
}
