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
            long results = 0;

            long qtdBlack = in.nextInt();
            long qtdWhite = in.nextInt();

            long priceBlack = in.nextInt();
            long priceWhite = in.nextInt();
            long priceTransform = in.nextInt();

            if ((priceBlack + priceTransform) < priceWhite) {
                results = (qtdBlack * priceBlack) + (qtdWhite * (priceBlack + priceTransform));
            } else if ((priceWhite + priceTransform) < priceBlack) {
                results = (qtdBlack * (priceWhite + priceTransform)) + (qtdWhite * priceWhite);
            } else {
                results = (qtdBlack * priceBlack) + (qtdWhite * priceWhite);
            }

            System.out.println(results);
        }

    }
}

