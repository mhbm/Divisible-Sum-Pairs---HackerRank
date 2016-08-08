import java.io.*;
import java.util.*;

public class Solution {

    static int j = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberCities = in.nextInt();
        int numberSpaceStations = in.nextInt();
        
        ArrayList<Integer> spaceStation = new ArrayList<Integer>();
        for (int i = 0; i < numberSpaceStations; i++) {
            spaceStation.add(in.nextInt());
        }
        
        Collections.sort(spaceStation);
        
        int maxDistance = 0;
        
        for (int i = 0; i < numberCities; i++) {
            int distance = 0;
            
            if (j + 1 == numberSpaceStations) {
                distance = Math.abs(spaceStation.get(j) - i);
            } else {
                distance = findMinDistancia(spaceStation, i);
            }
            if (maxDistance < distance) {
                maxDistance = distance;
            }
            
        }
        System.out.println(maxDistance);
    }
    
    public static int findMinDistancia(ArrayList<Integer> spaceStation, int i) {
        
        if (spaceStation.get(j) == i && spaceStation.get(j + 1) == i + 1) {
            j++;
            return 0;
        }
        
        int distanceA = Math.abs(spaceStation.get(j) - i);
        int distanceB = Math.abs(spaceStation.get(j + 1) - i);
        
        if (distanceA < distanceB) {
            return distanceA;
        } else {
            j++;
            return distanceB;
        }
    }
}
