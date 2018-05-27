package com.company.pierwszyplustrochedrugiego;

import java.util.Random;

public class lottonatablicy {
    public static void main(String[] args) {
        lottoMetoda();
    }

    public static void lottoMetoda() {
        int temp = 0;
        int tab[] = new int[6];
//        int tabp[] = new int[6];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            temp = random.nextInt(49) + 1;
            // temp = tab[i];
            for (int j = 0; j < tab.length; j++) {
                // temp = random.nextInt(49) +1 ;
                if (temp == tab[j]) {
                    while (temp != tab[j]) {
                        tab[i] = random.nextInt(49) + 1;
                    }
                }

            }

            System.out.print(tab[i] + " , ");
            // return tab;
        }
    }
}
