package com.company.drugiweekend;

public class Person {
    private int age;
    private String napis;

    public Person(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public int yearPasses() {
       age = age +1;
       return age;
    }

    public String amIOld(){
        if (age <= 19){
            return napis = "Teenager ";
        }
        else
        {
            return napis = "YOU'RE OLD FART!!! HAHAHA ";
        }
    }
}
