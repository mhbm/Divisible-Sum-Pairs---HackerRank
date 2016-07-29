import java.io.*;
import java.util.*;

public class Solution {

   public static void showAnswer(char[][] answer) {
        char empty = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[i][j] != 0) {
                    System.out.print(answer[i][j]);
                }
            }
            System.out.print(" ");
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String word = in.next();

        int groupWord = (int) Math.sqrt(word.length());
        if (Math.sqrt(word.length()) - groupWord > 0) {
            groupWord++;
        }

        char[][] answer = new char[groupWord][groupWord];

        int nRow = 0;
        int nCol = 0;

        for (int i = 0; i < word.length(); i++) {
            answer[nRow][nCol] = word.charAt(i);
            nRow++;
            if (nRow == groupWord) {
                nRow = 0;
                nCol++;
            }
        }
        showAnswer(answer);
    }
}
