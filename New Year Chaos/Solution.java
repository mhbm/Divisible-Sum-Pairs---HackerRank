import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberTests = in.nextInt();
        for (int i = 0; i < numberTests; i++) {
            int lenghtQueue = in.nextInt();
            int[] queue = new int[lenghtQueue];

            for (int j = 0; j < lenghtQueue; j++) {
                queue[j] = in.nextInt();
            }

            int bribes = 0, diff, temp, position;

            for (int cont = 0; cont < lenghtQueue; cont++) {
                diff = queue[cont] - (cont + 1);
                if (diff > 2) {
                    bribes = -1;
                    break;
                } else {
                    temp = queue[cont];
                    position = cont;
                    for (int j = cont - 1; j >= 0; j--) {
                        if (queue[j] < temp) {
                            break;
                        } else {
                            queue[position] = queue[j];
                            queue[j] = temp;
                            position--;
                            if (diff <= 0) {
                                bribes++;
                            }
                        }
                    }
                }
            }

            if (bribes != -1) {
                System.out.println(bribes);
            }else
                System.out.println("Too chaotic");

        }
    }
}

