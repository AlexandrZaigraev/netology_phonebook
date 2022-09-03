package org.example;

public class Main {
    public static void main(String[] args) {
        Phonebook ph1 = new Phonebook();
        ph1.createGroup("friends");
        Group group1 = ph1.getGroupByName("friends");
        group1.addContact(new Contact("254", "max"));
        group1.addContact(new Contact("789", "bob"));

        ph1.createGroup("neighbours");
        Group group2 = ph1.getGroupByName("neighbours");
        group2.addContact(new Contact("999", "wqef"));
        group2.addContact(new Contact("35741", "fdg"));

        System.out.println(ph1);

//        ph1
//                .getGroupByName("friends")
//                .addContact(new Contact("123", "sasha"));
    }
}
