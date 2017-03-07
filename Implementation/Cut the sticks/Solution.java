import java.io.*;
import java.util.*;

public class Solution {

    /**
     * @param in
     * @param number
     * @return 
     */
    public static ArrayList<Integer> putValueArray(Scanner in, int number) {
        ArrayList<Integer> numberArray = new ArrayList();
        for (int i = 0; i < number; i++) {
            numberArray.add(in.nextInt());
        }
        return numberArray;
    }

    public static int subtractArray(ArrayList<Integer> answer, int minValue) {
        int test = 0;
        for (int i = 0; i < answer.size(); i++) {
            answer.set(i, answer.get(i) - minValue);
            test++;
            if (answer.get(i) == 0) {
                answer.remove(i);
                i--;
            }
        }
        return test;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        ArrayList<Integer> answer = putValueArray(in, number);
        while (!answer.isEmpty()) {
            Collections.sort(answer);
            System.out.println(subtractArray(answer, answer.get(0)));
        }
    }
}
