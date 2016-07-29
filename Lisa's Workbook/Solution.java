import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int nChapters = in.nextInt();
        int nProbPage = in.nextInt();
        int nSpecial = 0;
        int pages = 1;
        int j = 1;
        for (int i = 0; i < nChapters; i++) {
            int nExercise = in.nextInt();
            for (j = 1; j <= nExercise; j++) {
                if (j == pages) {
                    nSpecial++;
                }
                if (j % nProbPage == 0) {
                    pages++;

                }
            }
            if ((j-1) % nProbPage != 0) {
                pages++;
            }
        }
        System.out.println(nSpecial);
    }
}
