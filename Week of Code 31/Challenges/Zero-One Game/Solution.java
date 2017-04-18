
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberGames = in.nextInt();
        for (int i = 0; i < numberGames; i++) {
            int numberSequence = in.nextInt();
            int[] sequence = new int[numberSequence];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < numberSequence; j++) {
                sequence[j] = in.nextInt();
                sb.append(sequence[j]);
            }
//            StringBuilder test = new StringBuilder(sequence);
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'

            String s = sb.toString();
            String sPrevious = s;
            do {
                sPrevious = s;
                s = s.replace("000", "00");
                s = s.replace("010", "00");
            } while (s.length() != sPrevious.length());
            
            System.out.println(((numberSequence - s.length()) % 2 == 1) ? "Alice" : "Bob");
        }

    }
}
