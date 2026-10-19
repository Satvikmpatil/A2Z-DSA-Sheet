import java.util.Arrays;

public class A4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 45, 6};
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
