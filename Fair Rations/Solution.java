import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberSequence = in.nextInt();
        int sequence[] = new int[numberSequence];
        for (int i = 0; i < numberSequence; i++) {
            sequence[i] = in.nextInt();
        }
        int loavesDistributed = 0;
        for (int i = 0; i < numberSequence; i++) {
            if (sequence[i] % 2 != 0) {
                loavesDistributed++;
                sequence[i] += 1;
                if (i != 0) {
                    if (sequence[i - 1] % 2 == 0) {
                        if (i + 1 == numberSequence) {
                            loavesDistributed = -1;
                            break;
                        }
                        sequence[i + 1] += 1;
                        loavesDistributed++;
                    } else {
                        sequence[i - 1] += 1;
                        loavesDistributed++;
                    }
                } else {
                    sequence[i + 1] += 1;
                    loavesDistributed++;
                }
            }
        }
        if (loavesDistributed == -1) {
            System.out.println("NO");
        } else {
            System.out.println(loavesDistributed);
        }
    }
}
