package exercices;

import exercices.controller.AutoController;
import exercices.model.Auto;
import exercices.model.Engine;
import exercices.model.Fuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        //dodanie 3 aut do zamówienia
        System.out.println("Dodano: " + ac.addAuto("VW", "Passat", Engine.v2_0, Fuel.diesel, 100000));
//        System.out.println("Dodano: " + ac.addAuto("VW","Golf", Engine.v1_9, Fuel.diesel,90000));
//        System.out.println("Dodano: " + ac.addAuto("VW","Tiguan", Engine.v3_0, Fuel.hybrid,180000));
//        //wypisz listę aut
//        ac.printAllAutos();
//        System.out.println("Usunięto:  " + ac.eraseAutoById(2));
//        ac.printAllAutos();
//
//
//        ac.changeAllAutosPrice(true,10);
//        ac.printAllAutos();
//
//        ac.changeAllAutosPrice(false,5);
//        ac.printAllAutos();

        //dodajemy GUI użytkownika

        // dodajemy GUI użytkownika
        Scanner scanner = new Scanner(System.in);
        int decision = ' ';
        // iterujemy dopoki nie wybrano Q
        while (decision != 'Q') {
            System.out.println("PANEL FABRYKI AUT");
            System.out.println("(Z) - zamów auto");
            System.out.println("(P) - pokaż listę zamówionych aut");
            System.out.println("(U) - usuń auto");
            System.out.println("(R) - zmień cenę auta");
            System.out.println("(C) - zmień cenę wszystkich aut");
            System.out.println("(Q) - wyjście");
            decision = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
            switch (decision) {
                case 'Z':
                    System.out.println("Jakiej marki auto chcesz zamówić? ");
                    String brandChoice = scanner.nextLine();
                    System.out.println("Jaki model auta chcesz zamówić? ");
                    String modelChoice = scanner.nextLine();
                    System.out.println("Jaki silnik chcesz zamówić? Dostępne warianty:\n v1_5 \n v1_9 \n v2_0 \n v3_0 \n");
                    Engine engineChoice = Engine.valueOf(scanner.next());

                    if (engineChoice == Engine.v1_5) {
                        System.out.println("Wybrałeś silnik o pojemności 1.5");
                    } else if (engineChoice == Engine.v1_9) {
                        System.out.println("Wybrałeś silnik o pojemności 1.9");
                    } else if (engineChoice == Engine.v2_0) {
                        System.out.println("Wybrałeś silnik o pojemności 2.0");
                    } else if (engineChoice == Engine.v3_0) {
                        System.out.println("Wybrałeś silnik o pojemności 3.0");
                    } else {
                        System.out.println("Wybierz model silnika: ");
                    }
                    System.out.println("Jaki typ silnika chcesz zamówić? \n jeśli diesel - wpisz 'diesel' \n jeśli benzynowy - wpisz 'gasoline' \n jeśli hybrydowy - wpisz 'hybrid' ");
                    Fuel fuelchoice = Fuel.valueOf(scanner.next());
                    if (fuelchoice == Fuel.diesel) {
                        System.out.println("Wybrałeś silnik diesla " + engineChoice);
                    } else if (fuelchoice == Fuel.gasoline) {
                        System.out.println("Wybrałeś silnik benzynowy " + engineChoice);
                    } else {
                        System.out.println("Wybrałeś silnik hybrydowy " + engineChoice);
                    }
                    System.out.println("Wprowadź cenę: ");
                    double priceChoice = scanner.nextDouble();
                    System.out.println("Cena modelu to: " + priceChoice);
                    ac.addAuto(brandChoice, modelChoice, engineChoice, fuelchoice, priceChoice);
                    break;
                case 'P':
                    ac.printAllAutos();
                    break;
                case 'U':
                    System.out.println("Wybierz numer auta które chcesz usunąć:");
                    ac.printAllAutos();
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Usunięto: " + ac.eraseAutoById(id));
                    break;
                case 'R':
                    System.out.println("(+) - podnieś cenę");
                    System.out.println("( ) - obniż cenę");
                    boolean isDiscountedSingle = scanner.nextLine().isEmpty();
                    System.out.println("Wybierz samochód którego cenę chcesz zmienić: ");
                    ac.printAllAutos();
                    int carId = scanner.nextInt();
                    System.out.println("Wybierz wartość procentową zmiany: ");
                    ac.discountAutoById(isDiscountedSingle,carId, scanner.nextInt());
                    System.out.println("Lista pojazdów po zmianach: ");
                    ac.printAllAutos();


                    break;
                case 'C':
                    System.out.println("(+) - podnieś cenę ");
                    System.out.println("( ) - obniż cenę ");
                    boolean isDiscounted = scanner.nextLine().isEmpty();
                    System.out.println("Wprowadź %");
                    ac.changeAllAutosPrice(isDiscounted, scanner.nextInt());
                    ac.printAllAutos();
                    break;
                case 'Q':
                    System.out.println("Do zobaczenia!");
                    break;
                default:
                    System.out.println("Błędny wybór");
            }
        }

    }

}
