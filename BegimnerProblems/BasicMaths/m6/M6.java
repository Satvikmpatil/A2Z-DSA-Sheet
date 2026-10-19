public class M6 {
    public static int res(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * res(num - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int mul = 1;
        for (int i = n; i > 1; i--) {
            mul = mul * i;
        }
        System.out.println("Fact : " + mul);
        System.out.println("RFact : " + res(n));
    }
}
