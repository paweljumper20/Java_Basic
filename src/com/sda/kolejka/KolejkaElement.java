package com.sda.kolejka;

public class KolejkaElement {
    int value;
    KolejkaElement previous;
    KolejkaElement next;


    public KolejkaElement(int liczba) {
        value = liczba;
        previous = null;
        next = null;
    }


    public void ustawPoprzedniElement(KolejkaElement element){
        previous = element;
    }

}
