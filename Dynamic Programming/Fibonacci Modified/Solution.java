import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Solution {

    static BigInteger a1;
    static BigInteger a2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = in.nextBigInteger();
        BigInteger t2 = in.nextBigInteger();

        a1 = t1;
        a2 = t2;
        int n = in.nextInt();

        modifiedFibonacci(n - 1);

        System.out.println(modifiedFibonacci(n - 1));
    }

    public static BigInteger modifiedFibonacci(int n) {
        switch (n) {
            case 0:
                return a1;
            case 1:
                return a2;
            default:
                return modifiedFibonacci(n - 2).add((modifiedFibonacci(n - 1).multiply(modifiedFibonacci(n - 1))));
        }
    }
}
