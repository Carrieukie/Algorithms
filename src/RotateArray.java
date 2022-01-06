import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 * Accepted
 * 914,637
 * Submissions
 * 2,437,592
 */
public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1, 2}, 2);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1); //reverse complete array
        reverse(nums, 0, k - 1); // reverse back the 1st half
        reverse(nums, k, nums.length - 1); // reverse back the 2nd half
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int startIndex, int endIndex) {
        // swapping the first and last element
        while (startIndex < endIndex) {
            int var = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = var;
            startIndex++;
            endIndex--;
        }
    }

}
