import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtdStack1 = in.nextInt();
        ArrayList<Integer> stack1 = new ArrayList<Integer>();

        int qtdStack2 = in.nextInt();
        ArrayList<Integer> stack2 = new ArrayList<Integer>();

        int qtdStack3 = in.nextInt();
        ArrayList<Integer> stack3 = new ArrayList<Integer>();

        setStackArray(stack1, qtdStack1, in);
        setStackArray(stack2, qtdStack2, in);
        setStackArray(stack3, qtdStack3, in);

        int tam1 = 0, tam2 = 0, tam3 = 0;
        tam1 = sumElementsStack(stack1);
        tam2 = sumElementsStack(stack2);
        tam3 = sumElementsStack(stack3);

        while (stack1.size() > 0 || stack2.size() > 0 || stack3.size() > 0) {

            if (tam1 == tam2 && tam1 == tam3) {
                break;
            }

            if (tam1 > tam2 && tam1 > tam3) {
                tam1 -= stack1.get(0);
                stack1.remove(0);
            } else if (tam2 > tam3) {
                tam2 -= stack2.get(0);
                stack2.remove(0);
            } else {
                tam3 -= stack3.get(0);
                stack3.remove(0);
            }
        }

        System.out.println(tam1);
    }

    public static void setStackArray(ArrayList<Integer> stack, int tamStack, Scanner in) {
        for (int i = 0; i < tamStack; i++) {
            stack.add(in.nextInt());
        }
    }

    public static int sumElementsStack(ArrayList<Integer> stack) {
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        return sum;
    }
}
