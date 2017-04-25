
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberTest = in.nextInt();

        for (int i = 0; i < numberTest; i++) {
            StringBuilder word = new StringBuilder(in.next());
            System.out.println(word.chars().distinct().count());
        }

    }
}

