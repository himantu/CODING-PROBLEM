import java.util.Arrays;
import java.util.Scanner;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements from the user
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Find median
        double median;
        if (size % 2 == 0) {
            median = (array[size / 2 - 1] + array[size / 2]) / 2.0;
        } else {
            median = array[size / 2];
        }

        // Print the median
        System.out.println("The median of the array is: " + median);
    }
}
