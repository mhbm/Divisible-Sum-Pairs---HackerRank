import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numArray;
        numArray = in.nextInt();
        int sumArray = 0 ;
        for (int cont = 0; cont < numArray; cont++) {
            sumArray += in.nextInt();
        }
        System.out.println(sumArray);
    }
}
