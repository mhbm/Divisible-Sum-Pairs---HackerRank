import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String[] vowel = new String[30];
        vowel[0] = "ae";
        vowel[1] = "ai";
        vowel[2] = "ao";
        vowel[3] = "au";
        vowel[4] = "ay";
        vowel[5] = "ea";
        vowel[6] = "ei";
        vowel[7] = "eo";
        vowel[8] = "eu";
        vowel[9] = "ey";
        vowel[10] = "ia";
        vowel[11] = "ie";
        vowel[12] = "io";
        vowel[13] = "iu";
        vowel[14] = "iy";
        vowel[15] = "oa";
        vowel[16] = "oe";
        vowel[17] = "oi";
        vowel[18] = "ou";
        vowel[19] = "oy";
        vowel[20] = "ua";
        vowel[21] = "ue";
        vowel[22] = "ui";
        vowel[23] = "uo";
        vowel[24] = "uy";
        vowel[25] = "ya";
        vowel[26] = "ye";
        vowel[27] = "yi";
        vowel[28] = "yo";
        vowel[29] = "yu";
        
        boolean control = false;
        
        for (int i = 0; i < vowel.length-1; i++) {
            if (word.contains(vowel[i]) == true) {
                System.out.println("No");
                control = true;
                break;
            }
        }

        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                System.out.println("No");
                control = true;
                break;
            }
        };
        
        if (control == false) {
            System.out.println("Yes");
        }
    }
}
