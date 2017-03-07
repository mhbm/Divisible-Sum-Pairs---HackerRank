import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberSequence = in.nextInt();
        int distancia = in.nextInt();

        int sequence[] = new int[numberSequence];
        for (int i = 0; i < numberSequence; i++) {
            sequence[i] = in.nextInt();
        }

        int results = 0;

        for (int i = 0; i < numberSequence; i++) {
            for (int j = i + 1; j < numberSequence; j++) {
                for (int k = j + 1; k < numberSequence; k++) {
                    if (sequence[j] - sequence[i] == distancia && sequence[k] - sequence[j] == distancia) {
                        results++;
                    } else if (sequence[j] - sequence[i] > distancia) {
                        break;
                    }
                }
            }
        }
        System.out.println(results);
    }
}
