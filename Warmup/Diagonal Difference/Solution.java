import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numCol = in.nextInt();
        int primaryDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < numCol; i++) {
            for (int y = 0; y < numCol; y++) {
                int number = in.nextInt();
                if (i == y) {
                    primaryDiagonal += number;
                }
                if ((i + y) == (numCol - 1)) {
                    secondDiagonal += number;
                }
            }
        }
        System.out.println(Math.abs(primaryDiagonal - secondDiagonal));
    }
}
