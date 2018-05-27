package com.company;

import com.company.pierwszyplustrochedrugiego.Human;

public class Main {

    public static void main(String[] args) {
        // write your code here

 /*       int x = 7;

        while (x < 13) {
            System.out.println(x);
            x++;
        }

        for (int i = 7; i <= 13; i++) {
            System.out.println("z for " + i);
        }

        for (int i = -10; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("parzysta " + i);
            }
*/
        // Scanner scanner = new Scanner(System.in);
//char a = '*';
        //SKANER!!!!
     /*   int wys = 6; // scanner.nextInt();
        for(int i = 0; i < wys; i++) {
            for (int j = 0; j < wys - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i *2; j++) {
                System.out.print("*");
            }
            System.out.println();

        }*/

        Human human = new Human();
        System.out.print("Imie: ");
        human.setImie("Marta");
        System.out.print(human.getImie());
        System.out.print(" Plec: ");
        human.setPlec(" kobieta ");
        System.out.println(human.getPlec());
        System.out.print(" Wiek: ");
        human.setWiek(25);
        System.out.print(human.getWiek());
        System.out.print(" Wzrost: ");
        human.setWzrost(165);
        System.out.print(human.getWzrost());
        System.out.print(" Waga: ");
        human.setWaga(50);
        System.out.print(human.getWaga());
         }
}


