package com.company.trzeciweekend;

import java.util.Scanner;

public class sterowanieAdresy {
    public static void main(String[] args) {

        AdressBook adressBook = new AdressBook();
        adressBook.add("Piotr", 126431914);
        adressBook.add("Michał", 126477961);
        adressBook.doesNameExist("Piotr");
        adressBook.get("Piotr");
        adressBook.printAll();
    }
}
