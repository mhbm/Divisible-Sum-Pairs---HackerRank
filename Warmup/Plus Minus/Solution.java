import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numbersPositive = 0;
        int numbersNegative = 0;
        int numbersZero = 0;
        float numberTotal = in.nextFloat();
        for (int i = 0; i < numberTotal; i++) {
            int number = in.nextInt();
            if (number > 0){
                numbersPositive++;
            }else if (number < 0) {
                numbersNegative++;
            } else numbersZero++;   
        }        
        float result = numbersPositive / numberTotal;
        System.out.println(result);
        result = numbersNegative / numberTotal;
        System.out.println(result);
        result = numbersZero / numberTotal;
        System.out.println(result);
    }
}
