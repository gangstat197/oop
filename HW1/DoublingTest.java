import java.util.Scanner;
import java.util.Arrays;
public class DoublingTest {
    public static void main() {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for (int i = 0; i < n - 1; ++i) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
