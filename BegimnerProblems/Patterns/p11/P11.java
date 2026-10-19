public class P11 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        int f = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (f % 2 == 0) {
                    System.out.print(1);
                    f++;
                } else {
                    System.out.print(0);
                    f++;
                }
            }
            System.out.println();
        }
    }
}
