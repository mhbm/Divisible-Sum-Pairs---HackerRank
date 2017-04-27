
import java.util.*;

public class Solution {

    static String solve(int year) {
        // Complete this function
        String result = "";
        if (year < 1918) {
            if (isLeapYearJulian(year)) {
                result = "12.09." + year;
            } else {
                result = "13.09." + year;
            }
        } else if (year > 1918) {
            if (isLeapYearGregorian(year)) {
                result = "12.09." + year;
            } else {
                result = "13.09." + year;
            }

        } else {
            result = "26.09." + year;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

    public static boolean isLeapYearGregorian(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static boolean isLeapYearJulian(int year) {
        return year % 4 == 0;
    }
}

