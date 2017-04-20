import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberCandies = in.nextInt();
        int numberCandiesBlows = 0;
        int max = 0;
        
        for (int i = 0; i < numberCandies; i++) {
            int candy = in.nextInt();
            if (max < candy) {
                max = candy;
                numberCandiesBlows = 1;
            } else if (max == candy) {
                numberCandiesBlows++;
            }
        }
        System.out.println(numberCandiesBlows);
    }
}

