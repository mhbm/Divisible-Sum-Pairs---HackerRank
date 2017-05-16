import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int numberTest = in.nextInt();
        int[] tests = new int[numberTest];
        int max = 0;

        for (int i = 0; i < numberTest; i++) {
            tests[i] = in.nextInt();
            if (max < tests[i]) {
                max = tests[i];
            }
        }

        String sInitial = "0";
        String tsInitial = "";
        String sExpanded = "";

        while (sExpanded.length() < max) {
            tsInitial = "";
            for (int i = 0; i < sInitial.length(); i++) {
                if (sInitial.charAt(i) == '0') {
                    tsInitial += "1";
                } else {
                    tsInitial += "0";
                }
            }
            sExpanded = sInitial + tsInitial;
            sInitial = sExpanded;
        }
        
        
        
        for (int i = 0; i < numberTest; i++) {
            System.out.println(sExpanded.charAt(tests[i]));
        }
    }
}

