
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
            int results = 0;
            int aux = 0;
            for (int j = words[i].length() - 1; j >= 0; j--) {
                if (isPalindrome(words[i]) == true) {
                    break;
                } else {
                    
                    int letterlast = (int) words[i].charAt(j);
                    int letterfirst = (int) words[i].charAt(aux);

                    while (words[i].charAt(j) != words[i].charAt(aux)) {
                        StringBuilder test = new StringBuilder(words[i]);
                        char letter;
                        if (letterlast > letterfirst) {
                            letter = (char) (words[i].charAt(j) - 1);
                        } else {
                            letter = (char) (words[i].charAt(j) + 1);
                        }

                        
                        test.setCharAt(j, letter);
                        words[i] = test.toString();
                        results++;
                    }
                    aux++;

                }
            }
            System.out.println(results);
        }

    }

    public static boolean isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder(word);
        reverse = reverse.reverse();
        return reverse.toString().equals(word);

    }

}

