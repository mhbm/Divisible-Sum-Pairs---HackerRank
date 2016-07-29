import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberFatorial = in.nextInt();
        
        BigInteger results = BigInteger.ONE;
        for (int i = 2; i <= numberFatorial; i++) {
           results = results.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(results);
    }
}
