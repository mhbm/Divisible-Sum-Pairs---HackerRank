import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int pointsAlice = 0;
        int pointsBob = 0;
        if (a0 > b0) {
            pointsAlice++;
        } else if (b0 > a0) {
            pointsBob++;
        }
        if (a1 > b1) {
            pointsAlice++;
        } else if (b1 > a1) {
            pointsBob++;
        }
        if (a2 > b2) {
            pointsAlice++;
        } else if (b2 > a2) {
            pointsBob++;
        }
        String result = pointsAlice + " " + pointsBob;
        System.out.println(result);
    }
}
