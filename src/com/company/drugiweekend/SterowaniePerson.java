package com.company.drugiweekend;

public class SterowaniePerson {
    public static void main(String[] args){
        Person osoba = new Person(18);
        System.out.print(osoba.getAge());
        System.out.println(osoba.amIOld());
        osoba.yearPasses();
        System.out.println(osoba.amIOld() + " age " + osoba.getAge());
        osoba.yearPasses();
        System.out.println(osoba.amIOld() + " age " + osoba.getAge());
        lottohashujace.lotto();


        }
}
