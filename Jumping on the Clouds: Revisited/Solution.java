import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberCloud = in.nextInt();
        int numberJump = in.nextInt();
        int cloud[] = new int[numberCloud];
        for (int i = 0; i < numberCloud; i++) {
            cloud[i] = in.nextInt();
        }
        int energy = 100;
        int position = 0;
        boolean finish = false;
        while (!finish) {
            position += numberJump;
            position = position % numberCloud;
            energy--;
            if (cloud[position] == 1) {
                energy -= 2;
            }
            if (position == 0) {
                finish = true;
            }
        }
        System.out.println(energy);
    }
}

