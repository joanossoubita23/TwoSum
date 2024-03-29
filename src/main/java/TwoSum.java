import java.util.HashMap;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            // Create a HashMap to store elements and their indices
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                // Check if the complement exists in the HashMap
                if (map.containsKey(complement)) {
                    // If found, return the indices of the two numbers
                    return new int[]{map.get(complement), i};
                }
                // Otherwise, put the current number and its index into the HashMap
                map.put(nums[i], i);
            }

            // If no solution is found, return an empty array or throw an exception
            throw new IllegalArgumentException("No two sum solution");
        }
    }


