/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(searchIterative(new int[]{-1,0,3,5,9,12}, 3));
    }

    public static int searchIterative(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right){
            int middle = (left + right ) / 2;

            if (nums[middle] == target){
                return middle;
            }


            if (nums[middle] > target){
                right = middle - 1;
            }

            if (nums[middle] < target){
                left = middle + 1;
            }
        }
        return -1;
    }




        public static int search(int[] nums, int target) {

        return search(nums, target, 0, nums.length - 1);

    }

//    recursive approach
    private static int search(int[] nums, int target, int left, int right) {
        int middle = ((left + right) + 1) / 2;
        if (nums[middle] == target) return middle;
        if (left >= right) return -1;
        if (nums[middle] < target) {
            return search(nums, target, middle, right);
        } else if (nums[middle] > target) {
            return search(nums, target, left, middle);
        }
        return -1;
    }

}
