
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        int lettersWrong = 0;

        for (int i = 0; i < word.length(); i = i + 3) {
            if (word.charAt(i) != 'S') {
                lettersWrong++;
            }
            if (word.charAt(i+1) != 'O') {
                lettersWrong++;
            }
            if (word.charAt(i+2) != 'S') {
                lettersWrong++;
            }
        }
        
        System.out.println(lettersWrong);

    }

}

