import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String time = in.next();

        DateFormat readFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = readFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date != null) {
            String formattedDate = writeFormat.format(date);
            System.out.println(formattedDate);
        }
    }
}
