import java.util.Scanner;

public class Binary {
    public static int GetPower(int n) {
        int pow = 1;
        while (pow <= n / 2) {
            pow *= 2;
        }

        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int power = GetPower(n);

        while (power > 0) {
            if (n < power) {
                System.out.print(0);
            } else  {
                System.out.print(1);
                n -= power;
            }

            power /= 2;
        }
        System.out.println();
        sc.close();
    }
}
