import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sequence[] = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int position = returnPosition(i+1, sequence);
            position = returnPosition(position, sequence);
            System.out.println(position);
        }
    }
    
    public static int returnPosition(int val, int[] sequence) {
        int i;
        for (i = 0; i < sequence.length; i++) {
            if (sequence[i] == val) {
                return i+1;
            }
        }
        return i;
    }
}

