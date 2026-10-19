public class P22 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int to = i;
                int lf = j;
                int bo = (2 * n - 2) - to;
                int ri = (2 * n - 2) - lf;
                System.out.print(n - Math.min(Math.min(to, bo), Math.min(lf, ri)) + " ");
            }
            System.out.println();
        }
    }
}
