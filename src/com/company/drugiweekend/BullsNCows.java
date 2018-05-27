package com.company.drugiweekend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BullsNCows {
        public static void main(String[] args) {

            Random gen = new Random();
            Scanner zgaduj = new Scanner(System.in);

            int liczCow = 0;
            int liczBull = 0;




            ArrayList<String> slownik = new ArrayList<>();
            slownik.add("KREM");
            slownik.add("DUPA");
            slownik.add("AUTO");
            slownik.add("ZUPA");
            slownik.add("PIES");
            slownik.add("JAKO");

            //  OGRANICZNIK NA PODSTAWIE WIELKOSCI LISTY - ILOSCI SLOW W BAZIE
            //  POTEM LOSOWANIE LOSOWEGO NUMERU KTORY JEST INDEXEM LISTY / TABLICY
            //  POTEM WYPISANIE SLOWA KTORE JEST W TABLICY POD WYSLOSOWANYM INDEXEM
            //  PRZYPISANIE OGRANICZNIKA I LOSOWEJ OSOBNO BO SYSTEM NIE PUSZCZAL TEGO RAZEM

            int ogranicz = slownik.size();
            int losowa = gen.nextInt(ogranicz);
            System.out.println("Wylosowany numer slowa: " + losowa);
            System.out.print(slownik.get(losowa));

         /* System.out.println("slowa w bazie: ");
            for (int i = 0; i < slownik.size(); i++) {

               ||||||||| METODA WYPISUJE WSZYSTKIE Z ZAKRESU - W TYM PRZYPADKU WSZYSTKIE Z LISTY / TABLICY ||||||||||||||||
                System.out.print(slownik.get(i) + " , ");


           } */

        //  POROWNYWANIE SLOW Z LISTY Z WPISANYMI
            int n = 0;
            for (int i = 0; i < slownik.size(); i++) {
                int numeracja = 0;
            }


        }

}


