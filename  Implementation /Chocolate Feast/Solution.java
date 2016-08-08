import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberTests = in.nextInt();
        for (int i = 0; i < numberTests; i++) {
            int chocolates = 0, totalChocolates = 0, restWrapper = 0;
            int money = in.nextInt();
            int priceChocolate = in.nextInt();
            int wrapper = in.nextInt();
            chocolates = money / priceChocolate;
            totalChocolates += chocolates;
            
            while (chocolates >= wrapper) {
                if (restWrapper > 0) {
                    restWrapper = (chocolates + restWrapper) % wrapper;
                    chocolates = (chocolates + restWrapper) / wrapper;
                    totalChocolates += chocolates;
                } else {
                    restWrapper = chocolates % wrapper;
                    chocolates = chocolates / wrapper;
                    totalChocolates += chocolates;
                }
            }
            if (restWrapper > 0) {
                chocolates = (chocolates + restWrapper) / wrapper;
                totalChocolates += chocolates;
            } else {
                chocolates = chocolates / wrapper;
                totalChocolates += chocolates;
            }
            System.out.println(totalChocolates);
        }

    }
}
