public class P17 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 - j + i));
            }
            System.out.println();
        }
    }
}
