import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberTestCases = in.nextInt();

        for (int i = 0; i < numberTestCases; i++) {
            int numberStudents = in.nextInt();
            int numberCancel = in.nextInt();
            int studentsNotLate = 0;
            for (int j = 0; j < numberStudents; j++) {
                int cont = in.nextInt();
                if (cont <= 0) {
                    studentsNotLate++;
                }
            }
            if (studentsNotLate >= numberCancel)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
