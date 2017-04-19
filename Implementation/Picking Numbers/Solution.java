import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int maxGroup = 0;
        int maxCount = 0;
        ArrayList<Integer> group = new ArrayList<>();
        ArrayList<Integer> groupMinus1 = new ArrayList<>();
        ArrayList<Integer> groupMayor1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            group = new ArrayList<>();
            group.add(a[i]);
            for (int j = i + 1; j < n; j++) {
                int result = a[i] - a[j];
                switch (result) {
                    case 0:
                        group.add(a[j]);
                        break;
                    case 1:
                        groupMayor1.add(a[j]);
                        break;
                    case -1:
                        groupMinus1.add(a[j]);
                        break;
                    default:
                        break;
                }

            }
            if (groupMayor1.size() > groupMinus1.size()) {
                group.addAll(groupMayor1);
            } else {
                group.addAll(groupMinus1);
            }
            
            if (maxGroup < group.size()) {
                maxGroup = group.size();
            }
            
            groupMayor1.clear();
            groupMinus1.clear();

        }

        System.out.println(maxGroup);
    }
}
