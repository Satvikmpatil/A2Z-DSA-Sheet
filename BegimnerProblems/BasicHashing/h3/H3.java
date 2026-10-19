import java.util.HashMap;
import java.util.Map;

public class H3 {
    public static void main(String[] args) {
        int[] num = {4, 4, 5, 5, 6};
        Map<Integer, Integer> ma = new HashMap<>();
        for (int v : num) {
            ma.put(v, ma.getOrDefault(v, 0) + 1);
        }
        int maxC = 0;
        int minC = Integer.MAX_VALUE;
        for (int v : ma.values()) {
            if (maxC < v) {
                maxC = v;
            }
            if (minC > v) {
                minC = v;
            }
        }
        System.out.println("Sum of Highest and Lowest Frequency: " + (maxC + minC));
    }
}
