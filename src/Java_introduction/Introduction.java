package Java_introduction;

// CTRL + /                         -> komentarz jednowierszowy
// CTRL + SHIFT + /                 -> komentarz blokowy
// psvm                             -> generuje public static void main(String[] args)
// sout                             -> System.out.println();
// CTRL + SHIFT + F10               -> run program
// CTRL + D                         -> duplikowanie linii


public class Introduction {
    //metoda uruchomieniowa -> automatycznie wywoływana jako pierwsza w trakcie uruchamiania projektu
    public static void main(String[] args) {
        //polecenie wypisujące wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello, world!");
        System.out.println(System.getProperty("java.version"));



        //typy danych
        int number = 50099;
        //byte mySmallNumber = 444; błąd zbyt mała precyzja typu byte
        System.out.println(number);
        System.out.println("dodawanie liczb: " + (100 + number));
        double salaryNet = 9000.67;
        int vatTax = 23;

        System.out.println("Kwota netto: " + salaryNet);
        System.out.println("kwota brutto: " + (salaryNet * (1 + (vatTax/100.0))) + "zł");
        //formatowanie wyjścia
        System.out.printf("Kwota brutto: %.2f zł\n", salaryNet * (1 + (vatTax/100.0)))  ;
        System.out.printf("%.2f netto to %.2f brutto\n", salaryNet, salaryNet * (1 + (vatTax/100.0))) ;

        char smallLetter = 'a';
        char bigLetter = 'A';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println((char) (bigLetter + 10));
        System.out.printf("wypisz ten znak z formatowaniem:  %c\n", dotChar);
        System.out.printf("znak: %c ma %d numer ASCII\n", dotChar, (int)dotChar);


        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);






        }
    }

