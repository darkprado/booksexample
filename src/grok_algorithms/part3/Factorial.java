package grok_algorithms.part3;

import java.math.BigInteger;

/**
 * @author S.Melekhin
 * @since 20 aug 2024 г.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(BigInteger.valueOf(13001)));
    }

    public static BigInteger fact(BigInteger x) {
        if (x.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return x.multiply(fact(x.subtract(BigInteger.ONE)));
    }

}
