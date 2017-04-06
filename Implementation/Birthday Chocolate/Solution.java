import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        int result = 0;
        int sum = 0;
        for (int i = 0; i < squares.length; i++) {
            sum += squares[i];
            for (int j = 1; j < m && i+j < squares.length; j++) {
                sum += squares[i + j];
            }
            if (sum == d) {
                result++;
            }
            sum = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
