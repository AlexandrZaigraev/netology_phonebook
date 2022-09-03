package org.example;

public class Main {
    public static void main(String[] args) {
        Phonebook ph1 = new Phonebook();
        ph1.createGroup("friends");
        ph1.createGroup("friends");

        System.out.println(ph1);

//        ph1
//                .getGroupByName("friends")
//                .addContact(new Contact("123", "sasha"));
    }
}
