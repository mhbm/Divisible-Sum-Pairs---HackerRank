import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberTests = in.nextInt();

        for (int i = 0; i < numberTests; i++) {
            long nPrisoners = in.nextLong();
            long nSweets = in.nextLong();
            long prisionerID = in.nextLong();

            nSweets = nSweets % (nPrisoners);
            long position = nSweets;

            if (prisionerID > 1) {
                position += prisionerID -1;
            }

            if (position % (nPrisoners) == 0) {
                System.out.println(nPrisoners);
            } else {
                System.out.println(position % (nPrisoners));
            }

        }

    }
}
