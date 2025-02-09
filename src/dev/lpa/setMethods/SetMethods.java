package dev.lpa.setMethods;

import java.util.Collection;
import java.util.List;

public class SetMethods {
    public static void main(String[] args) {
        List<Contact> emails = ContactData.getContactData("emails");
        List<Contact> phones = ContactData.getContactData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);
    }

    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-".repeat(50));
        System.out.println(header);
        System.out.println("-".repeat(50));
        contacts.forEach(System.out::println);
    }
}
