import java.util.*;

public class Solution {

    static int minSteps(int n, String B){
        // Complete this function
        
        return B.length() - B.replaceAll("010", "##").length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}

