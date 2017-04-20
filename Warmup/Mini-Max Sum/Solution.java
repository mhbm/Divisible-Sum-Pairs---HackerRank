import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long minus = a;
        long max = a;
        minus = minusValue(minus, b);
        minus = minusValue(minus, c);
        minus = minusValue(minus, d);
        minus = minusValue(minus, e);
        max = maxValue(max, b);
        max = maxValue(max, c);
        max = maxValue(max, d);
        max = maxValue(max, e);

        long resultMin = 0;
        long resultMax = 0;
        
        resultMax = a + b + c + d + e - minus;
        resultMin = a + b + c + d + e - max;
        
        System.out.println(resultMin + " " + resultMax);
    }

    public static long minusValue(long x, long y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static long maxValue(long x, long y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

