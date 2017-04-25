
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        int numberImpar = 0;

        for (int i = 0; i < word.length(); i++) {
            int count = 1;
            if (word.charAt(i) != '$') {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                if (count % 2 == 1) {
                    numberImpar++;
                }
                word = word.replace(String.valueOf(word.charAt(i)), "$");
            }
            
            if (numberImpar > 1) {
                break;
            }

        }
        
        if (numberImpar > 1) {
            System.out.println("NO");
        }else System.out.println("YES");

//        System.out.println(word);
    }

}
