
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberTests = in.nextInt();
        String[] word = new String[numberTests];
        String hackerrank = "hackerrank";

        for (int i = 0; i < numberTests; i++) {
            word[i] = in.next();
        }

        for (int i = 0; i < numberTests; i++) {
            
            int count = 0;

            for (int j = 0; j < word[i].length() && count < hackerrank.length(); j++) {
                if (word[i].charAt(j) == hackerrank.charAt(count)) {
                    count++;
                }
            }
            if (count == hackerrank.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}

