package com.sda.kolejka;

public class Main {
    public static void main(String[] args) {

      KolejkaLista kolejka = new KolejkaLista();
      kolejka.add(8);
      kolejka.add(10);
      kolejka.add(12);

        System.out.println(kolejka);
        int poczatek = kolejka.pop();
        System.out.println(poczatek);
        System.out.println(kolejka);
        int pierwszyWKolejce = kolejka.push();
        System.out.println(kolejka);

        kolejka.add(2);
        kolejka.add(56);
        kolejka.add(67);
        System.out.println(kolejka);

    }
}
