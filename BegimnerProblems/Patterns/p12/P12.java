public class P12 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = i + 1; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 - j);
            }
            System.out.println();
        }
    }
}
