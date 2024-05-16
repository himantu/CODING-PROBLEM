import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the first term (a), common difference (d), and number of terms (n)
        System.out.print("Enter the first term (a) of the AP series: ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference (d) of the AP series: ");
        int d = scanner.nextInt();
        System.out.print("Enter the number of terms (n) in the AP series: ");
        int n = scanner.nextInt();
        
        // Print the AP series
        System.out.println("The AP series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + i * d + " ");
        }
    }
}
