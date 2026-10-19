import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class H2 {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};
        Map<Integer, Integer> ma = new HashMap<>();
        for (int v : nums) {
            ma.put(v, ma.getOrDefault(v, 0) + 1);
        }
        int maxC = 0;
        for (int v : ma.values()) {
            if (v > maxC) {
                maxC = v;
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = ma.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            if (entry.getValue() == maxC) {
                it.remove();
            }
        }
        maxC = 0;
        int mostOcc = 0;
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : ma.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (first || v > maxC || (v == maxC && k < mostOcc)) {
                maxC = v;
                mostOcc = k;
                first = false;
            }
        }
        System.out.println("Second Highest Occurring Element: " + mostOcc);
    }
}
