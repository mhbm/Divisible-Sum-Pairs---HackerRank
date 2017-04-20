import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int cont = number - 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (cont <= j) {
                    System.out.print("#");
                } else
                    System.out.print(" ");
            }
            cont--;
            System.out.println("");
        } 
    }
}
