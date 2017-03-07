import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 0; i < number; i++) {
            int n = in.nextInt();
            int height = 1;
            for (int cont = 0; cont < n; cont++) {
                if ((cont + 1) % 2 == 1) {
                    height *= 2;
                } else {
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}

