package com.company.trzeciweekend;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AdressBook {
    public String name;
    public int number;

    public HashMap<String, Integer> mapa = new HashMap<>();

    public void add(String name, int number) {
        mapa.put(name, number);
    }

    public boolean doesNameExist(String name) {
        if (mapa.containsKey(name)) {
            System.out.println("wpis już istnieje");
            return true;
        }   else {
            return false;
        }

    }
        //IDK CZEMU NIE WYSPISUJE ALE BLEDU NIE MA
    public int get(String name) {
        return mapa.get(name);
    }


    //ITERACJA PO WSZYSTKICH KLUCZACH (NIEUPORZADKOWANYCH) - WYPISUJE WSZYSTKIE

        public void printAll (){
            for (String name : mapa.keySet()){
                System.out.println("name: " + name + " , number " + mapa.get(name));
             }
        }
    }



