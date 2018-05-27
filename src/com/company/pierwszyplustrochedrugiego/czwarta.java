package com.company.pierwszyplustrochedrugiego;
import java.util.Scanner;
public class czwarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj temperature w stopniach celsjusza");
        double temp = scanner.nextDouble();
        temp = temp * 1.8 + 32;
        System.out.println("W farenhaitach wynosi: " + temp);


       //TABLICZKA MNOZENIA
        for (int i = 0; i <= 10; i++) {

               for (int j = 0; j <= 10 ; j++) {
                  System.out.println( i + " * " + j + " = " + i * j);
                }
        }
    }
}
