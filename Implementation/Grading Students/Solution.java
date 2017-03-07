import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            int quocient = grade / 5;
            if ((quocient + 1) * 5 - grade < 3 && grade > 36) {
                System.out.println((quocient + 1) * 5);
            } else {
                System.out.println(grade);
            }
        }
    }
}
