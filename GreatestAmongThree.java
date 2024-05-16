import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the greatest among the three numbers
        int greatest = findGreatest(num1, num2, num3);
        
        // Print the greatest number
        System.out.println("The greatest among the three numbers is: " + greatest);
    }
    
    // Function to find the greatest among three numbers
    public static int findGreatest(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
