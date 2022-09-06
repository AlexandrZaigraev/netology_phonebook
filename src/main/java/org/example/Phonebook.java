package org.example;

import java.util.HashMap;

public class Phonebook {
    private HashMap<String, Group> groups;

    public Phonebook() {
        this.groups = new HashMap<>();
    }

    public void createGroup(String groupName) {
        Group group = new Group(groupName);
        this.groups.put(groupName, group);
    }

    public Group getGroupByName(String groupName) {
        return this.groups.get(groupName);
    }

    public String getContactByPhone(String phoneNumber) {
        for (Group value : groups.values()) {
            if (phoneNumber.equals(phoneNumber)) {
                return groups.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return groups.values().toString();
    }
}
