package conditional_instructions;

import java.util.Scanner;

public class Simplyinstructions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WPROWADŹ LICZBĘ: ");
        int liczba = in.nextInt();

        if (liczba == 0) {
            System.out.println("ZERO");
        } else if (liczba % 2 == 0) {
            System.out.println("LICZBA PARZYSTA");
        } else {
            System.out.println("LICZBA NIEPARZYSTA");
        }
        if(liczba > 0){
            System.out.println("LICZBA DODATNIA");
        } else {
            System.out.println("LICZBA UJEMNA");
        }
        in.close();
    }
}

// sprawdz czy liczba podana przez użytkownika jest parzysta
// jeśli tak wypisz parzysta
// jeśli nie wypisz nieparzysta
//jesli zero wypisz zero
