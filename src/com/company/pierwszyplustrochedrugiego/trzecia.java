package com.company.pierwszyplustrochedrugiego;

public class trzecia {
    public static void main(String[] args){
        int a = 1;
       // System.out.println(a);
        int b = 3;
        System.out.println("a: " + a + " , b: " + b);

        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " , b: " + b);

    }
}
