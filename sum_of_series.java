import java.util.Scanner;

public class sum_of_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the series 1 + 2 + 3 + ... + " + n + " is: " + sum);
    }
}