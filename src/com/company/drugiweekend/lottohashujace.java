package com.company.drugiweekend;

import java.util.HashSet;
import java.util.Random;

//TA KLASA DZIALA TYLKO PRZEZ SterowaniePerson.java - nie dodany main tutaj

public class lottohashujace {
  //  public static void main(String[] args) {
        public static void lotto () {
            HashSet<Integer> lotto = new HashSet<>();
            int count = 6;
            while (lotto.size() < count) {
                lotto.add((int) (Math.random() * 49 + 1));
            }
//na array liscie odwolujemy sie do adresu zawartosci a na secie do konkretnej wartosci
            System.out.println("wylosowane: ");
            for (int number : lotto) {
                System.out.print(number + " ");
            }
        }
    }

