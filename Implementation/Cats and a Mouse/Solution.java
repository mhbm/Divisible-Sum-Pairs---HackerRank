import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int catA = 0, catB = 0, mouseC = 0;

        for (int i = 0; i < q; i++) {
            catA = in.nextInt();
            catB = in.nextInt();
            mouseC = in.nextInt();

            int distanciaCatAtoMouseC = Math.abs(catA - mouseC);
            int distanciaCatBtoMouseC = Math.abs(catB - mouseC);

            if (distanciaCatAtoMouseC < distanciaCatBtoMouseC) {
                System.out.println("Cat A");
            } else if (distanciaCatBtoMouseC < distanciaCatAtoMouseC) {
                System.out.println("Cat B");
            } else {
                System.out.println("Mouse C");
            }
        }

        
    }
}
