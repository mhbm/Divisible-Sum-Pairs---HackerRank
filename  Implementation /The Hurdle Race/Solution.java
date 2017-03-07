import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            height.add(in.nextInt());
        }
        // your code goes here
        Collections.sort(height);
        
        int difference = height.get(height.size()-1) - k ;
        if (difference < 1) {
            System.out.println("0");
        } else {
            System.out.println(difference);
        }
    }
}
