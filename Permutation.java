import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values for n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();
        
        // Calculate nPr
        long nPr = calculatePermutation(n, r);
        
        // Print the result
        System.out.println("Permutation (" + n + ", " + r + ") = " + nPr);
    }
    
    // Function to calculate nPr
    public static long calculatePermutation(int n, int r) {
        long permutation = 1;
        for (int i = 0; i < r; i++) {
            permutation *= (n - i);
        }
        return permutation;
    }
}
