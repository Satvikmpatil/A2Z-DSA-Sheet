public class M4 {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rem;
        int rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
