package com.company.pierwszyplustrochedrugiego;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int b = scanner.nextInt();

       System.out.println( pomnoz(a, b ));
        System.out.println(podziel(a, b));
    }

        public static int pomnoz ( int a, int b){
            return a * b;
        }

        public static double podziel ( int a, int b){
            if (b > a) {
                System.out.println("tak to nie działa :(");
                return 0;

            }

            if (b == 0 ) {
                System.out.println("Nie dziel glabie przez ZERO");
                return 0;
            }
            return (double)a / b;
        }

}

