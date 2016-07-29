import java.io.*;
import java.util.*;

public class Solution {

    static ArrayList<Integer> answers = new ArrayList<>();

    public static void sumDigits(int part1, int part2, int number) {
        int numberPart2 = 0;
        int numberPart1 = 0;
        long squareNumber = (long) Math.pow(number, 2);
        
        
        for (int i = 0; i < part2; i++) {
            if (i == 0) {
                numberPart2 += squareNumber % 10;
            } else {
                numberPart2 += (((int) Math.pow(10, i)) * (squareNumber % 10));
            }
            squareNumber /= 10;
        }

        for (int i = 0; i < part1; i++) {
            if (i == 0) {
                numberPart1 += squareNumber % 10;
            } else {
                numberPart1 += (((int) Math.pow(10, i)) * (squareNumber % 10));
            }
            squareNumber /= 10;
        }

        if ((numberPart1 + numberPart2) == number) {
            answers.add(number);
        }
    }

    public static void displayAnswer() {
        int i;
        for (i = 0; i < answers.size() - 1; i++) {
            System.out.print(answers.get(i) + " ");
        }
        System.out.println(answers.get(i));

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int pLowest = in.nextInt();
        int qHighest = in.nextInt();
        
        for (int i = pLowest; i <= qHighest; i++) {
            if (i == 1) {
                answers.add(1);
            } else {
                int squareNumber = (int) Math.pow(i, 2);
                int numberDigits = (int) Math.log10(squareNumber) + 1;
                if (numberDigits != 1) {
                    int part1 = numberDigits / 2;
                    int part2 = part1;
                    if (numberDigits % 2 == 1) {
                        part2++;
                    }
                    sumDigits(part1, part2, i);
                }
            }
        }
        if (answers.isEmpty()) {
            System.out.print("INVALID RANGE");
        } else {
            displayAnswer();
        }

    }
}
