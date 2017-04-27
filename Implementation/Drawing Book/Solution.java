
import java.util.*;

public class Solution {

    static int solve(int n, int p) {
        // Complete this function
        int initial = 0;
        int pages = 0;

        if (p % 2 == 0) {
            pages = p + 1;
        } else {
            pages = p;
        }

        if (pages != 1) {
            for (int i = 1; i < pages; i = i + 2) {
                initial++;
            }
        }

        int finalCount = 0;

        if (p % 2 == 0) {
            pages = p + 1;
        } else {
            pages = p;

        }
        for (int i = n; i > pages; i = i - 2) {
            finalCount++;
        }
        if (initial < finalCount) {
            return initial;
        } else {

            return finalCount;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}

