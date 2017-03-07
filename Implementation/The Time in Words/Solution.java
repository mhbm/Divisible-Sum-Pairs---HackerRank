import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   private static final String[] minutesWord = {
        "",
        "one minute",
        "two minutes",
        "three minutes",
        "four minutes",
        "five minutes",
        "fix minutes",
        "seven minutes",
        "eight minutes",
        "nine minutes",
        "ten minutes",
        "eleven minutes",
        "twelve minutes",
        "thirteen minutes",
        "fourteen minutes",
        "quarter",
        "sixteen minutes",
        "seventeen minutes",
        "eighteen minutes",
        "nineteen minutes",
        "twenty minutes",
        "twenty one minutes",
        "twenty two minutes",
        "twenty three minutes",
        "twenty four minutes",
        "twenty five minutes",
        "twenty six minutes",
        "twenty seven minutes",
        "twenty eight minutes",
        "twenty nine minutes",
        "half"
    };

    private static final String[] hourWord = {
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve"
    };

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int minutes = in.nextInt();
        String answer = "";

        if (minutes == 0) {
            minutesWord[hour] = minutesWord[hour].replace(" minutes", "");
            minutesWord[hour] = minutesWord[hour].replace(" minute", "");
            System.out.print(minutesWord[hour] + " o' clock");

        
        } else if (minutes <= 30) {
            System.out.print(minutesWord[minutes] + " past " + hourWord[hour]);
        } else if (minutes > 30) {

            System.out.print(minutesWord[60 - minutes] + " to " + hourWord[hour + 1]);
        }

    }
}

