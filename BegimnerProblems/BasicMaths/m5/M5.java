public class M5 {
    public static void main(String[] args) {
        int n = 134241;
        int c = 0;
        while (n > 0) {
            int m = n % 10;
            c = Math.max(m, c);
            n = n / 10;
        }
        System.out.println("Max : " + c);
    }
}
