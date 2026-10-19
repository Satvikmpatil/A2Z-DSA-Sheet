public class M9 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
