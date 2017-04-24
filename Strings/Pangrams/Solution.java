
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine().replace(" ", "").toLowerCase();
        int alfab = 0;
        
        String alphabet = ""; 

        
        for (int i = 0; i < word.length() && alfab < 26; i++) {
            char letter = word.charAt(i);
            if (letter >= 97 && letter <= 122 && !alphabet.contains(Character.valueOf(letter).toString())) {
                alphabet += letter;
                alfab++;
            }
        }

        if (alfab == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }

    }

}

