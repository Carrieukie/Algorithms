import java.util.Arrays;
import java.util.HashMap;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * Example 2:
 * <p>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * Example 3:
 * <p>
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */

public class TwoSum2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum2(new int[]{1,2,3,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        HashMap<Integer, Integer> numIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndex.containsKey(nums[i])) {
                ans[0] = numIndex.get(nums[i]);
                ans[1] = i + 1;
                return ans;
            } else {
                numIndex.put(target - nums[i], i + 1);
            }
        }
        return ans;
    }

    //Using pointers
    public static int[] twoSum2(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int sum = nums[left] + nums[right];

        while (sum != target) {
            sum = nums[left] + nums[right];
            if (sum > target) {
                sum -= nums[right--];
                sum += nums[right];
            } else if (sum < target) {
                sum -= nums[left++];
                sum += nums[left];

            } else {
                left++;
                right++;
            }
        }

        return new int[]{++left, ++right};

    }


}
