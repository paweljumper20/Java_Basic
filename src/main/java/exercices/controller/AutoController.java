package exercices.controller;

import exercices.model.Auto;
import exercices.model.Engine;
import exercices.model.Fuel;

import java.util.ArrayList;
import java.util.List;

// AutoController - klasa implementująca logikę biznesową aplikacji
// 1. Zawiera listę aut
// 2. Implementuje metodę za pomocą której można dodać auto do listy
// 3.
public class AutoController {
    //    private Auto [] autos = new Auto[100]; deklaracja pustej tablicy aut o długości 100
    private ArrayList<Auto> autos = new ArrayList<>();

    public Auto addAuto(String brand, String model, Engine engineType, Fuel fuelType, double price) {
        // Utworzenie obiektu
        Auto auto = new Auto(brand, model, engineType, fuelType, price);
        //zapis do listy aut
        autos.add(auto);
        return auto;
    }

    public void printAllAutos() {
        for (int i = 0; i < autos.size(); i++) {
            System.out.printf("| %3d | %15s | %15s | %15s | %15s | %15.2fzł |\n", i + 1, autos.get(i).getBrand(), autos.get(i).getModel(), autos.get(i).getEngine(), autos.get(i).getFuel(), autos.get(i).getPrice());
        }
    }

    public Auto eraseAutoById(int id) {
        return autos.remove(id - 1);
    }


    public Auto findAutoById(int id) {
        return autos.get(id - 1);
    }

    public void discountAutoById(boolean isDiscountedSingle,int id, int discountPercent) {
        Auto discountingAuto = findAutoById(id);
        if(isDiscountedSingle) {
            discountingAuto.setPrice(discountingAuto.getPrice() * (100 - discountPercent) / 100);
        }else {discountingAuto.setPrice(discountingAuto.getPrice() * (100 + discountPercent) / 100);}

    }

    public void changeAllAutosPrice(boolean isDiscounted, int discountPercent) {
        for (int i = 0; i <autos.size(); i++) {
            if (isDiscounted) {
                autos.get(i).setPrice(autos.get(i).getPrice() * (100 - discountPercent)/100);
            } else { autos.get(i).setPrice(autos.get(i).getPrice() * (100 + discountPercent)/100);}
        }
    }


}
