
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String word = in.next();
        StringBuilder word = new StringBuilder(in.next());
        
        for (int i = 0; i < word.length()-1; i++) {
            
            if (word.charAt(i) == word.charAt(i+1)) {
                word.deleteCharAt(i+1);
                word.deleteCharAt(i);
                i = -1;
            }
        }
        
        if (word.length() == 0) {
            System.out.println("Empty String");
        } else System.out.println(word);

    }

}

