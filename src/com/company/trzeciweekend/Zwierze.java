package com.company.trzeciweekend;

import java.util.ArrayList;
import java.util.List;

abstract class Zwierze {
  /* public int waga;
   public String nazwa; */

    public static void main(String[] args) {


        Dog pies = new Dog("Burek", 30);
        Horse kasztan = new Horse("kasztan" , 10);


        //polimorfizm
        List<Zwierze> mojaLista = new ArrayList<>();
        mojaLista.add(pies);
        mojaLista.add(kasztan);

        System.out.println(pies);

    }
}
