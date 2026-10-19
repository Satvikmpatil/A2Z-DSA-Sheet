public class M10 {
    public static boolean prime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (prime(i)) {
                count++;
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Count : " + count);
        System.out.println("Sum : " + sum);
    }
}
