public class P13 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n);
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
