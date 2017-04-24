import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();  
        int countWords = 1;
        
        for (int i = 0; i < word.length(); i++) {
            
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90){
                countWords++;
            }
        }
        System.out.println(countWords);     
    } 
}
