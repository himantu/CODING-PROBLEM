import java.util.Scanner;

public class SumOfPalindromeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int sum = calculateSumOfPalindromeNumbers(limit);

        System.out.println("The sum of palindrome numbers up to " + limit + " is: " + sum);
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }

        return reversedNumber == number;
    }

    // Function to calculate the sum of palindrome numbers
    public static int calculateSumOfPalindromeNumbers(int limit) {
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            if (isPalindrome(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
