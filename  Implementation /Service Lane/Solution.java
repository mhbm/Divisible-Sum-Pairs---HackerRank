import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberFreeway = in.nextInt();
        int numberTests = in.nextInt();
        ArrayList<Integer> width = new ArrayList<>();
        for (int widthN = 0; widthN < numberFreeway; widthN++) {
            int tam = in.nextInt();
            width.add(tam);
        }

        for (int lineN = 0; lineN < numberTests; lineN++) {
            int i = in.nextInt();
            int j = in.nextInt();
            int minimum = 9999999;
            for (int k = i; k <= j; k++) {
                if (width.get(k) < minimum) {
                    minimum = width.get(k);
                }
            }
            System.out.println(minimum);
        }
        
    }
}

