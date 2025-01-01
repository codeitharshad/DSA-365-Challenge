public class TwoSum {
    
    /**
     * Finds two indices in the array whose values sum up to the target.
     * This method uses a brute-force approach with nested loops.
     *
     * @param nums The input array of integers.
     * @param target The target sum.
     * @return An array of two integers representing the indices of the two numbers
     *         that add up to the target. Returns an empty array if no solution is found.
     */


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; 
                }
            }
        }
        return new int[] {};
    }

    /**
     * Main method to test the `twoSum` function.
     * It calls the `twoSum` method with an example input and prints the result.
     *
     * @param args Command-line arguments (not used in this example).
     */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
