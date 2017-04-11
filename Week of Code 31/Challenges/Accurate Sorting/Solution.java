import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberTest = in.nextInt();
        for (int cont = 0; cont < numberTest; cont++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            // Write Your Code Here
            
            for (int i = 0; i < n-1; i++) {
                if (Math.abs(a[i] - a[i + 1]) == 1) {
                    if (a[i + 1] < a[i]) {
                        int test = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = test;
                    }
                } 
            }
            boolean control = false;
            for (int i = 0; i < n-1; i++) {
                if (a[i] > a[i+1]) {
                    control = true;
                    break;
                }
            }
            
            if (control == false) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            

        }
    }
}
