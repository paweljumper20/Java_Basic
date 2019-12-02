package com.sda.kolejka;

public class Main {
  public static void main(String[] args) {

    Kolejka kolejka = new Kolejka();

    if (kolejka.isEmpty()) System.out.println("Kolejka jest pusta");

    kolejka.add(7);
    kolejka.add(5);
    kolejka.add(3);

    kolejka.show();
    System.out.println("Pierwszy element w kolejce to: "+kolejka.pop());
    System.out.println("Zdejmujemy element pierwszy");
    kolejka.push();
    kolejka.show();

    kolejka.add(4);
    kolejka.add(7);
    kolejka.add(0);
    kolejka.add(12);
    kolejka.add(1);
    kolejka.add(8);
    kolejka.show();

    kolejka.find(15);
    kolejka.delete(4);
    kolejka.show();

    kolejka.showReverse();


    System.out.println("Ostatni element w kolejce to: " + kolejka.popLast());


    System.out.println("Usuwam ostatni element z listy: " + kolejka.pushLast());

    kolejka.show();

    kolejka.swap(0,12);
    kolejka.show();
  }
}