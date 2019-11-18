package loops;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //znajdujemy sie w petli nieskonczonej dopoki nie szostanie
        boolean isFinished = false;
        while (isFinished != true) {
            // CLI --> Commmand Line Interface
            System.out.println("Witaj w naszej aplikacji");
            System.out.println("(L) - Logowanie");
            System.out.println("(D) - Rejestracja");
            System.out.println("(Q) - Wyjście");

            char decision = in.nextLine().toUpperCase().charAt(0);
            switch (decision) {
                case 'L':
                    System.out.println("Logowanie");
                    break;

                case 'D':
                    System.out.println("Rejestracja");
                    break;
                case 'Q':
                    System.out.println("Wyjście");
                    isFinished = true;
                    //przerwanie pętli
                    break;

                default:
                    System.out.println("zły wybór");
                    break;

            }
        }
    }
}