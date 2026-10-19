import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j + i <= n + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
