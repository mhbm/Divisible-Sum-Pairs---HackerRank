import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberCloud = in.nextInt();
        int cloud[] = new int[numberCloud];
        for (int i = 0; i < numberCloud; i++) {
            cloud[i] = in.nextInt();
        }
        int jumps = 0;
        boolean control = false;
        for (int i = 0; i < numberCloud; i++) {
            if (cloud[i] != 1) {
                if (i + 1 < numberCloud && cloud[i + 1] == 0) {
                    jumps++;
                    control = true;
                }
                if (i + 2 < numberCloud && cloud[i + 2] == 0) {
                    if (control == false) {
                        jumps++;
                    }
                    i++;
                }
                control = false;
            }
        }
        System.out.println(jumps);
    }
}

