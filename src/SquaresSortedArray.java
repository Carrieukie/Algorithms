import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 * <p>
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,3,11})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0; // pointer 1
        int j = nums.length - 1; // pointer 2
        int k = nums.length - 1;

        while(i <= j){
            if (nums[i] * nums[i] <= nums[j] * nums[j]){
                ans[k] = nums[j] * nums[j];
                j--;
            }
            else{
                ans[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }
        return ans;
    }

}
