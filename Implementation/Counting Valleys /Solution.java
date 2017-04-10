import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String steps = in.next();
        int numberValleys = 0;
        int seaLevel = 0;
        boolean control = false;
        for (int i = 0; i < steps.length(); i++) {
            if (steps.charAt(i) == 'U') {
                seaLevel++;
            } else {
                seaLevel--;
            }

            if (seaLevel < 0) {
                control = true;
            } else {
                if (control == true) {
                    numberValleys++;
                    control = false;
                }
            }

        }

        System.out.println(numberValleys);
    }
}
