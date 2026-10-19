public class A2 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 1, 3, 6};
        int odd = 0;
        for (int k : a) {
            if (k % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Odd : " + odd);
    }
}
