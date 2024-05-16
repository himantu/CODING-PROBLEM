import java.util.Scanner;

public class NthTermOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Find the nth term of the series
        int nthTerm = findNthTerm(n);
        
        // Print the nth term
        System.out.println("The " + n + "th term of the series is: " + nthTerm);
    }
    
    // Function to find the nth term of the series
    public static int findNthTerm(int n) {
        // The first term of the series is 1
        int firstTerm = 1;
        
        // The common difference is 2
        int commonDifference = 2;
        
        // Calculate the nth term using the formula
        int nthTerm = firstTerm + (n - 1) * commonDifference;
        
        return nthTerm;
    }
}
