
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberTest = in.nextInt();
        
        for (int i = 0; i < numberTest; i++) {
            String word = in.next();            
            String wordReverse = new StringBuilder(word).reverse().toString();
            boolean control = true;
            
            for (int j = 1; j < word.length(); j++) {
                int dif = word.charAt(j-1) - word.charAt(j);
                int difReverse = wordReverse.charAt(j-1) - wordReverse.charAt(j);
                
                if (Math.abs(dif) != Math.abs(difReverse)) {
                    control = false;
                    break;
                }
                
            }
            
            if (control == false) {
                System.out.println("Not Funny");
            } else System.out.println("Funny");
        }
    }

}

