
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Mateus Macedo
 */
public class Solution {

    static int aux = 0;
    static ArrayList<Integer> matrix = new ArrayList<>();

    public static void main(String[] args) {
        int d = 0, n = 0, m = 0;

        Scanner in = new Scanner(System.in);
        d = in.nextInt();

        ArrayList<Integer> result;

        for (int i = 0; i < d; i++) {
            n = in.nextInt();
            m = in.nextInt();

            ArrayList<Integer> events = new ArrayList<>();
            ArrayList<Integer> eventsOrder = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                events.add(in.nextInt());
            }
            eventsOrder = (ArrayList<Integer>) events.clone();
            Collections.sort(eventsOrder);

            aux = events.size();

            result = new ArrayList<>();
            matrix = new ArrayList<>();

            for (int j = 0; j < eventsOrder.size(); j++) {
                for (int k = j + 1; k < eventsOrder.size(); k++) {
                    if (eventsOrder.get(j) + eventsOrder.get(k) > n) {
                        break;
                    } else if (eventsOrder.get(j) + eventsOrder.get(k) == n) {
                        result.add(eventsOrder.get(j));
                        result.add(eventsOrder.get(k));
                        break;
                    }
                }
                if (!result.isEmpty()) {
                    printResult(result, events);
                    break;
                }
            }

        }

    }

    public static void printResult(ArrayList<Integer> result, ArrayList<Integer> events) {

        for (int i = 0; i < result.size(); i++) {
            matrix.add(findPosition(events, result.get(i)));
        }
        Collections.sort(matrix);

        for (int i = 0; i < matrix.size(); i++) {
            if (i < matrix.size() - 1) {
                System.out.print(matrix.get(i) + " ");
            } else {
                System.out.println(matrix.get(i));
            }
        }
    }

    public static int findPosition(ArrayList<Integer> events, int value) {
        int position = 0;

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i) == value && !matrix.contains(i + 1)) {
                position = i;
                break;
            }
        }
        if (events.size() == aux || position == events.size() || position == 0) {
            return position + 1;
        } else {
            return position + (aux - events.size());
        }
    }
}
