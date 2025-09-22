import java.util.Scanner;

public class PrimeSieve {
    public static boolean[] isPrime = new  boolean[10_000_000];
    public static void Sieve(int n){
        for (int i = 0;  i <= n; i++){
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (isPrime[i]) {
                for (int j = 2; i * j <= n; ++j) {
                    isPrime[i * j] = false;
                }
            }
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sieve(n);

        int countPrimes = 0;
        for (int i = 1; i <= n; ++i) {
            countPrimes += isPrime[i] ? 1 : 0;
        }

        System.out.println("The number of primes <= " + n + " is " + countPrimes);
        sc.close();
    }
}
