import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
            pendrives[pendrives_i] = in.nextInt();
        }

        int value = 0;
        int result = -1;

        for (int i = 0; i < n; i++) {
            value = 0;
            for (int j = 0; j < m; j++) {
                value = keyboards[i] + pendrives[j];
                if (value <= s) {
                    if (result < value) {
                        result = value;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
