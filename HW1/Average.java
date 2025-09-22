import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double value = sc.nextDouble();
            sum += value;
            count++;
        }

        System.out.println("Average is " + sum/count);
        sc.close();
    }
}
