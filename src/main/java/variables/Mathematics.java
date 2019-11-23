package variables;

import static java.lang.Math.pow;

public class Mathematics {
    public static void main(String[] args) {
        // stałę z klasy matematycznej

       final double PI =  Math.PI;
       // x^y
        int x = 5;
        int y = 2;
        int result =(int) pow(x,y);
        // konwersja na typ integer (int)
        System.out.println(result);
        // pierwiastek 3 stopnia z 8

        System.out.println(pow(8,1.0/3));

        int a = 5;
        int b = 8;


        //wynik działania jest typu składników działania
        System.out.println(a*b);
        //konwersja rozszerzająca -> konwersja do typu wyższej precyzji
        System.out.println(((double)a)/b);

        //konwersja zawężąjaca -> konwersja do typu o niższej precyzji
        double measure = 1.443;
        System.out.println((int)measure);
    }
}
