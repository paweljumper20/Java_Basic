package variables;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        //postinkrementacja
        System.out.println(i++);
        // po wypisaniu zmienna jest inkrementowana
        System.out.println(i);

        // predekrementacja

        System.out.println(--j);
        // po wypisaniu

        System.out.println(j);


        //sprawdz czy użytkownik jest pełnoletni
        //-> jezeli jego wiek jest >= 18 lat to wypisz jestś pełnoletni
        //-> w przeciwnym razie wypisz nie jesteś pełnoletni

        int age ;
        // użytkownik wprowadza wartośc
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wiek: ");
        age = scanner.nextInt();

        boolean isHuman = age >= 0 && age <= 130 ? true : false;
        String isMature = age >= 18 ? " Jesteś dorosły " : " nie jesteś dorosły ";
        System.out.println(isHuman ? isMature : "ROBOT");




    }
}
