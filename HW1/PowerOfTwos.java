import java.util.Scanner;

public class PowerOfTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int power = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + ": " + power);
            power = power * 2;
        }

        sc.close();
    }
}
