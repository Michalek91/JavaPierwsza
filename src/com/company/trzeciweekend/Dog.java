package com.company.trzeciweekend;

public class Dog extends Zwierze {
    private int waga;
    private String nazwa;

    public Dog (String nazwa, int waga) {
        this.waga = waga;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "waga=" + waga +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
