import java.util.HashSet;

public class ContainsDuplicate {

    /**
     * Checks if the input array contains any duplicate elements.
     *
     * @param nums the input array of integers
     * @return true if any value appears at least twice in the array, false otherwise
     */

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false; 
    }

     /**
     * The main method to test the containsDuplicate method with example test cases.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Output: " + containsDuplicate(nums1)); 
    }
}
