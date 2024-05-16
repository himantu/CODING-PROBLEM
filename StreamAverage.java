public class StreamAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add the current element to the sum
            double average = sum / (i + 1); // Calculate the average
            System.out.printf("%.2f ", average); // Print the average
        }
    }
}
