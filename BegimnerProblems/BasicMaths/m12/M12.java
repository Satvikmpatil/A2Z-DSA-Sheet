public class M12 {
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    public static void main(String[] args) {
        int n = 12;
        int m = 6;
        System.out.println("GCD : " + gcd(n, m));
    }
}
