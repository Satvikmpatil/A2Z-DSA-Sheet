import java.util.HashMap;
import java.util.Map;

public class H1 {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};
        Map<Integer, Integer> ma = new HashMap<>();
        int maxC = 0;
        int moO = nums[0];
        for (int v : nums) {
            ma.put(v, ma.getOrDefault(v, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : ma.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v > maxC || (v == maxC && k < moO)) {
                maxC = v;
                moO = k;
            }
        }
        System.out.println("MaxCount : " + maxC);
        System.out.println("MostOcc : " + moO);
    }
}
