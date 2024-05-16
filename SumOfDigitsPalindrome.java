import java.util.Scanner;

public class SumOfDigitsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfDigits = findSumOfDigits(number);
        boolean isPalindrome = isPalindrome(sumOfDigits);

        if (isPalindrome) {
            System.out.println("The sum of digits " + sumOfDigits + " is a palindrome.");
        } else {
            System.out.println("The sum of digits " + sumOfDigits + " is not a palindrome.");
        }
    }

    // Function to find the sum of digits of a number
    public static int findSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Function to check if a number is a palindrome
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
}
