package org.example;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("123", "sasha");

        Group group1 = new Group("friends");
        group1.addContact(contact1);
        group1.showContacts();
        group1.findContact("123");
    }
}
