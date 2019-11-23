package bigNumbers;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
//        long number = 5555555555555555L
        BigInteger bigInteger1 = new BigInteger("5555555555555555555555555555555555555555");
        BigInteger bigInteger2 = new BigInteger("2222222222222222222222222222222222222222222222");


        // metody klasy big integer
        BigInteger bigIntegerResult = bigInteger1.add(bigInteger2);
        System.out.println(bigIntegerResult);
    }
}
