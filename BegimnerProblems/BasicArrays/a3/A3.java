import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elems of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ls = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < ls) {
                System.out.println("Not sorted");
                sc.close();
                return;
            }
            ls = a[i];
        }
        System.out.println("Sorted");
        sc.close();
    }
}
