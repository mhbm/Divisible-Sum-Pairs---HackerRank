
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberTest = in.nextInt();

        String[] words = new String[numberTest];
        for (int i = 0; i < numberTest; i++) {
            words[i] = in.next();
        }

        for (int i = 0; i < numberTest; i++) {
            int deletions = 0;
            String test = new String(words[i]);
            boolean control = true;
            while (control == true) {
                String newWord = test.replaceAll("AA", "A").replaceAll("BB", "B");
                if (newWord.length() == test.length()) {
                    control = false;
                } else {
                    test = newWord;
                }
            }
            System.out.println(words[i].length() - test.length());

        }
    }
}

