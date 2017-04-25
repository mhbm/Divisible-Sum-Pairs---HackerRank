
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberTest = in.nextInt();

        String[] words = new String[numberTest];
        int minus = Integer.MAX_VALUE;
        int minusPosition = 0;
        for (int i = 0; i < numberTest; i++) {
            words[i] = in.next();
            if (minus > words[i].length()) {
                minus = words[i].length();
                minusPosition = i;
            }
        }
        int result = 0;
        String test = "";
        for (int i = 0; i < words[minusPosition].length(); i++) {

            char letter = words[minusPosition].charAt(i);
            if (!test.contains(String.valueOf(letter))) {
                test += letter;
                boolean control = true;
                for (int j = 0; j < numberTest; j++) {

                    if (!words[minusPosition].equals(words[j])) {

                        if (!words[j].contains(String.valueOf(letter))) {
                            control = false;
                            break;
                        }
                    }

                }
                if (control == true) {
                    result++;
                }
            }
        }
        System.out.println(result);

    }

}

