import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void showAnswer(String grid[]) {
        for (int i = 0; i < grid.length; i++) {
            System.out.println(grid[i]);
        }
    }
    
    public static String markX(String grid, int positionX) {
        char[] gridChars = grid.toCharArray();
        gridChars[positionX] = 'X';
        return String.valueOf(gridChars);
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next();
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {

                int verifyNumber = Character.getNumericValue(grid[i].charAt(j));
                int numberLeft = Character.getNumericValue(grid[i].charAt(j - 1));
                int numberRight = Character.getNumericValue(grid[i].charAt(j + 1));
                int numberUp = Character.getNumericValue(grid[i-1].charAt(j));
                int numberDown = Character.getNumericValue(grid[i+1].charAt(j));
                if (verifyNumber > numberLeft && verifyNumber > numberRight && verifyNumber > numberDown && verifyNumber > numberUp) {
                    grid[i] = markX(grid[i], j);
                }

            }
        }
        
        showAnswer(grid);

    }
}
