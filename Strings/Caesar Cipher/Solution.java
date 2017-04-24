import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String s = in.next();
    int k = in.nextInt();

    int AASCII = 65, ZASCII = 90, aASCII = 97, zASCII = 122;
    int alph = 26;

    for (int i=0;i<n;i++)

        // Check whether it is a char.

        if(s.charAt(i)>=AASCII && s.charAt(i)<=ZASCII || s.charAt(i)>=aASCII && s.charAt(i)<=zASCII)


            if(s.charAt(i)+k%alph>=AASCII && s.charAt(i)+k%alph<=ZASCII 
               || (s.charAt(i)+k%alph>=aASCII && s.charAt(i)+k%alph<=zASCII) && s.charAt(i)>=aASCII)

                System.out.print(Character.toString((char)(s.charAt(i)+k%alph)));

            else
                System.out.print(Character.toString((char)(s.charAt(i)+(k%alph-alph))));

        // if the char is a symbol, print it.
        else
            System.out.print(Character.toString((char)s.charAt(i)));

}
}
