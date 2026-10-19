import java.util.ArrayList;
import java.util.List;

public class M14 {
    public static List<Integer> divisors(int n) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                num.add(i);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("divisors : " + divisors(n));
    }
}
