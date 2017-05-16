import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberMonster = in.nextInt();
        int hit = in.nextInt();
        int seconds = in.nextInt();

        ArrayList<Integer> monster = new ArrayList<>();
        for (int i = 0; i < numberMonster; i++) {
            monster.add(in.nextInt());
        }
        Collections.sort(monster);
        
        int dieMonster = 0;
        for (int i = 0; i < seconds; i++) {
            int number = monster.get(0)-hit;
             if (number <= 0 ) {
                 monster.remove(0);
                 dieMonster++;
             } else {
                 monster.set(0, number);
             }
        }
        
        System.out.println(dieMonster);
    }
}

