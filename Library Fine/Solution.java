import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //Date of return
        int dayReturn = in.nextInt();
        int monthReturn = in.nextInt();
        int yearReturn = in.nextInt();
        // Date of expected
        int dayExpected = in.nextInt();
        int monthExpected = in.nextInt();
        int yearExpected = in.nextInt();

        if (yearReturn < yearExpected || (monthReturn < monthExpected && yearReturn == yearExpected)) {
            System.out.println(0);
        } else if (yearReturn > yearExpected) {
            System.out.println(10000);
        } else if (monthReturn > monthExpected && yearExpected == yearReturn) {
            System.out.println(500 * (monthReturn - monthExpected));
        } else if (dayReturn > dayExpected) {
            System.out.println(15 * (dayReturn - dayExpected));
        } else {
            System.out.println(0);
        }
    }
}
