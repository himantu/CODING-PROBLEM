public class DiceProblem {
    public static void main(String[] args) {
        int diceSides = 6; // Number of sides on each dice
        int targetSum = 7; // Target sum to find the probability for

        int totalPossibilities = diceSides * diceSides; // Total number of possible outcomes (36 for two dice)
        int favorableOutcomes = 0; // Count of outcomes resulting in the target sum

        // Iterate over all possible outcomes of rolling two dice
        for (int die1 = 1; die1 <= diceSides; die1++) {
            for (int die2 = 1; die2 <= diceSides; die2++) {
                // Check if the sum of the two dice equals the target sum
                if (die1 + die2 == targetSum) {
                    favorableOutcomes++;
                }
            }
        }

        // Calculate the probability of getting the target sum
        double probability = (double) favorableOutcomes / totalPossibilities;

        // Print the result
        System.out.println("Probability of getting a sum of " + targetSum + " when rolling two dice: " + probability);
    }
}
