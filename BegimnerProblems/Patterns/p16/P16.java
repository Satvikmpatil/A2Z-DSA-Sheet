public class P16 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + i));
            }
            System.out.println();
        }
    }
}
