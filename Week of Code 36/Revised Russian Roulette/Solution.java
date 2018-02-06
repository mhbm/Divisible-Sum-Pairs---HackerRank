
import java.util.*;

public class Solution {

    static int[] revisedRussianRoulette(int[] doors) {
        // Complete this function
        int[] result = new int[2];
        int maxDoors = 0;
        int minDoors = 0;

        for (int i = 0; i < doors.length; i++) {
            if (doors[i] == 1) {
                doors[i] = 0;
                minDoors++;
                if (i + 1 < doors.length && doors[i + 1] == 1) {
                    doors[i + 1] = 0;
                    maxDoors += 2;
                    i++;
                } else {
                    maxDoors += 1;
                }
            }
        }
           result[0] = minDoors;
            result[1] = maxDoors;
            return result;
    }

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for (int doors_i = 0; doors_i < n; doors_i++) {
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }
}

