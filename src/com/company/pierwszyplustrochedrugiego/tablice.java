package com.company.pierwszyplustrochedrugiego;

import java.util.Random;
import java.util.Scanner;

public class tablice {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
/*    System.out.println("podaj pierwszy bok");
    int a = scanner.nextInt();
    System.out.println("podaj drugi bok");
    int b = scanner.nextInt();
    System.out.print("pole prostokata to: "+ a*b + " obwod prostokata to: " + ((a*2) + (b*2)));
*/

        //Tablica z zczytywaniem z klawiatury
  /*  int ilosc = 4;
    String [] imiona = new String[5];

    for (int i = 0; i < 4; i++) {
        System.out.println("podaj imie");
        imiona[i] = scanner.next();
    }

    for (int x= 0; x < imiona.length; x++){
        System.out.println("Twoje imie to : " + imiona[x]);
    } */
        /* Ta sekcja dziala
        String[] prog = {"p", "r", "o", "g", "r", "a", "m", "o", "w", "a", "n", "i", "e"};
        for (int i = 0; i < prog.length; i++) {
            System.out.print(prog[i]);
        }
        for (int i = 0; i < prog.length; i++) {
            System.out.println(prog[i]);
        }*/
   /*     for (int i = 0; i < prog.length; i++) {
            while (i=0) {
                prog[i] = prog.toUpperCase();
            }
            else{
                System.out.println(prog[i]);
            }*/
//a To ni cholery nie dziala
        // for (int i = prog.length ; i < prog.length; i--) {
//            System.out.print(prog[i]);
        //  }
        int tab[] = new int[10];
        Random random = new Random();
        // int wylosowana =
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(40) - 20;
            System.out.print(tab[i] + " , ");
        }
        int max = tab[0];
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                System.out.println("max to: " + tab[i]);
                max = tab[i];

            }
            if (min > tab[i]) {
                System.out.println("min to: " + tab[i]);
                min = tab[i];

            }

        }
        int srednia = 0;
        for (int i = 0; i < tab.length; i++) {
            srednia = srednia + tab[i];

        }
        srednia = srednia / tab.length;
        System.out.println("srednia to: " + srednia);

        //POROWNANIE NIE ZLICZA PRAWIDLOWO
        int porownanieplus = 0;
        int porownanieminus = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < srednia) {
                porownanieplus = porownanieplus++;
                }
            if(tab[i] > srednia){
                porownanieminus = porownanieminus++;
                    }
        }
        System.out.println("elementow wiekszych od sredniej: " + porownanieplus + " , a mniejszych od sredniej: " + porownanieminus);
        }

    }

