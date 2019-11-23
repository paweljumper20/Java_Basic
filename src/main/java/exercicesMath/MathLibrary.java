package exercicesMath;

public class MathLibrary {
    //1. zaimplementuj metodę zwracającą średnią wartości typu double podanych w argumencie metody jako tablica

    public static double avg(double[] args) {

        double sum = 0;
        for (double a : args) {
            sum += a;
        }
        return sum / args.length;


    }

    public static int power(int x, int y) {
        int power = 1;

        for (int i = 0; i < y; i++) {
            power *= x;
        }
        return power;
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }


    public static long factorialR(int n) {
        if (n > 1) {
            return n * factorialR(n - 1);
        } else return 1;


    }
    //  suma n ciągu fibonacciego
    //
    public static long fiboSum(int n){
         int [] fibo = new int [n];
        fibo[0] = 0;
        fibo[1] = 1;
        System.out.print(fibo[0] + " ");
        System.out.print(fibo[1] + " ");
        int fiboSum = 1;
        for (int i=2;i<fibo.length;i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.print(fibo[i] + " ");
            fiboSum += fibo[i];
        }
        System.out.println();
        return fiboSum;
    }

}
