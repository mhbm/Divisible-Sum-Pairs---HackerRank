import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void rotation(int matrix[][], int numberRow, int numberColumn, int position) {

        int aux = matrix[position][position];
        int aux2 = 0;
        int i;

        for (i = position + 1; i < numberRow - position; i++) {
            aux2 = matrix[i][position];
            matrix[i][position] = aux;
            aux = aux2;
        }

        for (i = position + 1; i < numberColumn - position; i++) {
            aux2 = matrix[numberRow - position - 1][i];
            matrix[numberRow - position - 1][i] = aux;
            aux = aux2;
        }

        for (i = numberRow - 2 - position; i >= position; i--) {
            aux2 = matrix[i][numberColumn - position - 1];
            matrix[i][numberColumn - position - 1] = aux;
            aux = aux2;
        }

        for (i = numberColumn - position - 2; i >= position; i--) {
            aux2 = matrix[position][i];
            matrix[position][i] = aux;
            aux = aux2;
        }

    }

    public static int rotationNecessary(int numberRow, int numberColumn, int position) {

        int totalRotation = (2 * ((numberRow - position) - (position + 1))) + 2 * ((numberColumn - position) - (position + 1));
        return totalRotation;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int numberM = in.nextInt();
        int numberN = in.nextInt();
        int rotation = in.nextInt();

        int matrix[][] = new int[numberM][numberN];

        for (int i = 0; i < numberM; i++) {
            for (int j = 0; j < numberN; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int rotationNecessaries = 0;
        int position = 0;
        for (int cont = 0; cont < numberN && cont < numberM; cont += 2) {
            rotationNecessaries = rotationNecessary(numberM, numberN, position);
            if (rotationNecessaries != 0) {
                rotationNecessaries = rotation % rotationNecessaries;
            }
            
            for (int i = 0; i < rotationNecessaries; i++) {
                rotation(matrix, numberM, numberN, position);
            }
            position++;
        }
        int i;
        int j;
        
        for (i = 0; i < numberM; i++) {
            for (j = 0; j < numberN - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(matrix[i][j]);
            if (i != (numberM - 1)) {
                System.out.println("");
            }
        }
        //  System.out.println(Arrays.deepToString(matrix));

    }
}
