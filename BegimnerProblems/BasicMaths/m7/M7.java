import java.util.ArrayList;
import java.util.List;

public class M7 {
    public static void main(String[] args) {
        int n = 12;
        int original = n;
        List<Integer> a = new ArrayList<>();
        while (n > 0) {
            int temp = n % 10;
            a.add(temp);
            n = n / 10;
        }
        int s = a.size();
        int sum = 0;
        for (int digit : a) {
            sum = sum + (int) Math.pow(digit, s);
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
