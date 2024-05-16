import java.util.Scanner;

public class SumOfPowerOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an even number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Please enter an even number.");
            return;
        }

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int sum = calculateSumOfPowerOfEven(number, power);

        System.out.println("The sum of " + number + "^" + number + " for power " + power + " is: " + sum);
    }

    // Function to calculate the sum of power of an even number
    public static int calculateSumOfPowerOfEven(int number, int power) {
        int sum = 0;
        for (int i = 1; i <= power; i++) {
            sum += Math.pow(number, i);
        }
        return sum;
    }
}
