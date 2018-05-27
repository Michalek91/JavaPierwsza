package com.company.pierwszyplustrochedrugiego;

import java.util.Scanner;

public class pierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dane = scanner.nextInt();
        for (int k = 0; k < dane; k++) {
            if (k % 2 == 1) {
                System.out.print(k + " , ");

                }

            }

        for (int i = 1; i <= dane; i++) {
            if (dane % i == 0) {
                System.out.print(i + " <- dzielnik ");
            }
        }
    }
}