import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kang_x1 = in.nextInt();
        int kang_v1 = in.nextInt();
        int kang_x2 = in.nextInt();
        int kang_v2 = in.nextInt();
        equalPosition(kang_x1, kang_x2);

        String answer = "";

        int kangA_x1 = kang_x1;
        int kangA_v1 = kang_v1;
        int kangB_x2 = kang_x2;
        int kangB_v2 = kang_v2;

        if (kang_x2 < kang_x1) {
            kangA_x1 = kang_x2;
            kangA_v1 = kang_v2;
            kangB_x2 = kang_x1;
            kangB_v2 = kang_v1;
        }

        while (kangA_x1 < kangB_x2) {
            kangA_x1 += kangA_v1;
            kangB_x2 += kangB_v2;
            answer = equalPosition(kangA_x1, kangB_x2);
            
        }
        System.out.println(answer);
    }

    public static String equalPosition(int x1, int x2) {
        if (x1 == x2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

