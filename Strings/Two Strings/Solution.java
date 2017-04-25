
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberTest = in.nextInt();
        for (int i = 0; i < numberTest; i++) {

            String a = in.next();
            String b = in.next();

            LinkedHashSet<Character> lhA = new LinkedHashSet<>();
            LinkedHashSet<Character> lhB = new LinkedHashSet<>();

            for (int j = 0; j < b.length(); j++) {
                lhB.add(b.charAt(j));
            }

            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (lhB.contains(a.charAt(j))) {
                    count++;
                }

                if (count == 2) {
                    break;
                }
            }

            if (count == 2) {
                System.out.println("YES");;
            } else {
                System.out.println("NO");
            }

        }

    }
}

