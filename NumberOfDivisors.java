import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int divisorsCount = findNumberOfDivisors(number);

        System.out.println("Number of divisors of " + number + " is: " + divisorsCount);
    }

    // Function to find the number of divisors of a positive integer
    public static int findNumberOfDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
