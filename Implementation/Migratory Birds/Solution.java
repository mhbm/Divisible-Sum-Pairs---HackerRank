import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberBirds = in.nextInt();
        int[] countTypes = new int[6];
        for (int i = 0; i < numberBirds; i++) {
            countTypes[in.nextInt()]++ ;
        }
        
        int maxTypes = 0;
        int position = 0;
        
        for (int i = 0; i < countTypes.length; i++) {
            if (maxTypes < countTypes[i]) {
                maxTypes = countTypes[i];
                position = i;
            } 
        }
        
        System.out.println(position);
    }
}
