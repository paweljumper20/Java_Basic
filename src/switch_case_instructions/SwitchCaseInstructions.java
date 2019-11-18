package switch_case_instructions;

import java.util.Scanner;

public class SwitchCaseInstructions {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
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
            default:
                System.out.println("zły wybór");
                break;
        }


        Grade grade = Grade.dopuszczajacy;
        switch (grade){
            case celujacy:
                System.out.println("świetnie jesteś najlepszy!");
                break;
            case bardzo_dobry:
                System.out.println("jest nieźle");
                break;
            case dobry:
                System.out.println("Jest dobrze");
                break;
            case dostateczny:
                System.out.println("Słabo");
                break;
            case dopuszczajacy:
                System.out.println("Bardzo słabo");
                break;
            case niedostateczny:
                System.out.println("Tragicznie ");
                break;
        }
    }
}
