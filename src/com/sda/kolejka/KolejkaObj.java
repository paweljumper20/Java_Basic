package com.sda.kolejka;

public class KolejkaObj {

    KolejkaElement pierwszy;
    KolejkaElement ostatni;

    public KolejkaObj() {
        pierwszy = null;
        ostatni = null;
    }

    public void add(int liczba) {
        KolejkaElement nowyElement = new KolejkaElement(liczba);
        KolejkaElement przedostatni = ostatni;
        if(ostatni == null){
          pierwszy = ostatni = nowyElement; }
        else {
            nowyElement.ustawPoprzedniElement(ostatni);
            ostatni = nowyElement;
        }
    }

    public int pop() {
        return 0;
    }

    public int push() {
        return 0;
    }
    @Override
    public String toString() {
        String opis = null;

        if(pierwszy != null){

        } else return "Kolejka jest pusta";
       return null;

    }

}
