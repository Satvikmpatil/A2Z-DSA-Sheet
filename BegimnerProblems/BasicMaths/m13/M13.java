public class M13 {
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        System.out.println("LCM : " + lcm(n, m));
    }
}
