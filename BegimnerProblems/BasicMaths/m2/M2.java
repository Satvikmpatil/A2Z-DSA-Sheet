public class M2 {
    public static void main(String[] args) {
        int n = 15222;
        int c = 0;
        while (n > 0) {
            int k = n % 10;
            if (k % 2 != 0) {
                c++;
            }
            n = n / 10;
        }
        System.out.println("Count : " + c);
    }
}
