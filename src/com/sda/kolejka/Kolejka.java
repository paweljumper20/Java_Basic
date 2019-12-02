package com.sda.kolejka;


import java.util.Collection;
import java.util.Collections;

public class Kolejka {

    private Element pierwszy;
    private Element ostatni;

    public Kolejka() {
        pierwszy = null;
        ostatni = null;
    }


    public void add(int wartosc) {
        Element nowyElement = new Element(wartosc);
        if (isEmpty()) {
            pierwszy = ostatni = nowyElement;
        } else {
            nowyElement.setPoprzedni(ostatni);
            ostatni.setNastepny(nowyElement);
            ostatni = nowyElement;
        }
    }

    public int pop() {
        return pierwszy.getWartosc();
    }

    public int push() {
        int zwracana = pierwszy.getWartosc();
        pierwszy = pierwszy.getNastepny();
        pierwszy.setPoprzedni(null);
        return zwracana;
    }

    public Element find(int szukana) {
        Element indexElement = pierwszy;
        int index = 0;
        while (indexElement != null) {
            if (szukana == indexElement.getWartosc()) {
                System.out.println("Wartosc " + szukana + " została znaleziona na indeksie " + index);
                return indexElement;
            } else {
                index++;
                indexElement = indexElement.getNastepny();
            }
        }
        System.out.println("Niestety nie znalazłem wartości " + szukana);
        return null;
    }

    public boolean delete(int usuwana) {
        Element znaleziony = find(usuwana);
        if (znaleziony != null) {
            if (znaleziony == pierwszy) push();
            else {
                if (znaleziony == ostatni) {
                    ostatni = ostatni.getPoprzedni();
                    ostatni.setNastepny(null);
                } else {
                    znaleziony.getPoprzedni().setNastepny(znaleziony.getNastepny());
                    znaleziony.getNastepny().setPoprzedni(znaleziony.getPoprzedni());
                }
            }
            return true;
        }
        return false;

    }

    public void show() {
        Element indexElement = pierwszy;

        while (indexElement != null) {
            System.out.print(indexElement.getWartosc() + " ");
            indexElement = indexElement.getNastepny();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if (ostatni == null) return true;
        else return false;
    }

    public void showReverse() {
        Element indexElement = ostatni;

        while (indexElement != null) {
            System.out.print(indexElement.getWartosc() + " ");
            indexElement = indexElement.getPoprzedni();
        }
        System.out.println();
    }

    public int popLast() {
        return ostatni.getWartosc();
    }

    public int pushLast() {
        int zwracana = ostatni.getWartosc();
        ostatni = ostatni.getPoprzedni();
        ostatni.setNastepny(null);
        return zwracana;
    }

    public boolean swap(int index1, int index2) {
        Element szukana1 = find(index1);
        Element szukana2 = find(index2);
        int temp1;
        int temp2;

        while (szukana1 != null && szukana2 != null) {
            if (szukana1 != szukana2) {
                System.out.println("zamieniane wartości " + szukana1.getWartosc() + "|" + szukana2.getWartosc());
                temp1 = szukana1.getWartosc();
                temp2 = szukana2.getWartosc();
                szukana1.setWartosc(temp2);
                szukana2.setWartosc(temp1);
                System.out.println("Udało się zamienić wartości: " + szukana1.getWartosc() + " oraz " + szukana2.getWartosc());
                return true;
            } else System.out.println("Nie możesz zamienić dwóch jednakowych liczb!");

        }
        System.out.println("Nie znaleziono liczb");
        return false;
    }
}