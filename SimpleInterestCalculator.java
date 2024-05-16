import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal amount, rate of interest, and time period from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double timePeriod = scanner.nextDouble();
        
        // Calculate simple interest
        double simpleInterest = (principal * rateOfInterest * timePeriod) / 100;
        
        // Print the simple interest
        System.out.println("Simple interest: " + simpleInterest);
    }
}
