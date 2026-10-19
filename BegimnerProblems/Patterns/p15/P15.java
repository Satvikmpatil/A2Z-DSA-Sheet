public class P15 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}
