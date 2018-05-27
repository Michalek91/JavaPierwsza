package com.company.drugiweekend;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.Collections;

public class ListyArraya {
    public static void main(String[] args) {

        ArrayList<String> kolory = new ArrayList<>();
        String c;

        kolory.add("czerwony");
        kolory.add("czarny");
        kolory.add("zielony");
        kolory.add("niebieski");
        kolory.add("bialy");

        System.out.println(kolory.get(1));

        for (int i = 0; i < kolory.size(); i++){
            System.out.print(kolory.get(i) + " , ");
        }

        }
    }


