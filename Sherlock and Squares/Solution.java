import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int lineN = 0; lineN < number; lineN++) {
            int numberA = in.nextInt();
            int numberB = in.nextInt();
            int numberSquares = 0;
            for (int i = (int) Math.sqrt(numberA); i <= (int) Math.sqrt(numberB); i++) {
                if (i * i >= numberA && i * i <= numberB) {
                    numberSquares++;
                }
            }
            System.out.println(numberSquares);

        }

    }
}
