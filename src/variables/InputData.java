package variables;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //wprowadzam liczbę
        System.out.println("Wprowadz liczbe całkowitą: ");
        int number = scan.nextInt();
        //aby skonsumować ENTER wykonujemy metodę nextLine
        scan.nextLine();
        // wprowadzam napis
        System.out.println("Wprowadz napis: ");
        String text = scan.nextLine();


        //zamknięcie połączenia

        scan.close();
    }
}
