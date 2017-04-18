
import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberGames = in.nextInt();
        for (int i = 0; i < numberGames; i++) {
            int numberSequence = in.nextInt();
            int[] sequence = new int[numberSequence];
            StringBuilder test = new StringBuilder();
            for (int j = 0; j < numberSequence; j++) {
//                sequence = in.next();
                test.append(in.next());
            }
//            StringBuilder test = new StringBuilder(sequence);
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
            boolean end = false;
            boolean player = true; // true= Bob, false = Alice

            while (end == false) {
                
                if (test.indexOf("000") != -1 || test.indexOf("010") != -1) {
                    for (int j = 1; j < test.length() - 1; j++) {
                        
                        if (test.charAt(j - 1) == '0' && test.charAt(j + 1) == '0') {
                            test.deleteCharAt(j);
                            player = !player;
                            break;
                        }
                    }

                } else {
                    end = true;
                }
            }

            if (player == true) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }

        }

    }
}

