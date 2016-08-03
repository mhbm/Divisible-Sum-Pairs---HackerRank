import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberGroups = in.nextInt();
        int numberPeople = in.nextInt();

        String matrix[] = new String[numberGroups];

        for (int i = 0; i < numberGroups; i++) {
            matrix[i] = in.next();
        }
        int groups = 0;
        int maxKnow = 0;
        for (int i = 0; i < numberGroups; i++) {
            for (int j = i + 1; j < numberGroups; j++) {
                int knowGroup = countKnowTopic(matrix[i], matrix[j]);
                if (maxKnow < knowGroup) {
                    maxKnow = knowGroup;
                    groups = 1;
                } else if (maxKnow == knowGroup) {
                    groups++;
                }
            }
        }
        System.out.println(maxKnow);
        System.out.println(groups);
    }

    public static int countKnowTopic(String group1, String group2) {
        int count = 0;
        for (int i = 0; i < group1.length(); i++) {
            if (group1.charAt(i) == '1' || group2.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
