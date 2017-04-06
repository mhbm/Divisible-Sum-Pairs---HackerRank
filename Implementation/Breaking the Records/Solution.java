import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int[] results = new int[2];

        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }

        int highestScore = s[0];
        int lowestScore = s[0];

        for (int i = 1; i < s.length; i++) {
            if (s[i] > highestScore) {
                highestScore = s[i];
                results[0]++;
            } else if (s[i] < lowestScore) {
                lowestScore = s[i];
                results[1]++;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
