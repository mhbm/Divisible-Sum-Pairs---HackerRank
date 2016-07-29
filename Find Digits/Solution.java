import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberTestCases = in.nextInt();
        
        for (int i = 0; i < numberTestCases; i++) {
            int cont = 0;
            String numbers = in.next();
            int numbersVerifiy = Integer.parseInt(numbers);
            for (int j = 0; j < numbers.length(); j++) {
                int index = Character.getNumericValue(numbers.charAt(j));
                if (index != 0 && numbersVerifiy % index == 0)
                     cont++;
            }
            System.out.println(cont);

        }
    }
}
