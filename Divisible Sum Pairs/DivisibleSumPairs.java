/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivisibleSumPairs;

import java.util.Scanner;

/**
 *
 * @author Mateus Macedo
 */
public class DivisibleSumPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int numbers[] = new int[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }        
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((numbers[i] + numbers[j]) % k == 0) {
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }

}
