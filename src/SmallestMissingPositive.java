///**
// * 41. First Missing Positive
// * Hard
// *
// * 8233
// *
// * 1231
// *
// * Add to List
// *
// * Share
// * Given an unsorted integer array nums, return the smallest missing positive integer.
// *
// * You must implement an algorithm that runs in O(n) time and uses constant extra space.
// *
// *
// *
// * Example 1:
// *
// * Input: nums = [1,2,0]
// * Output: 3
// * Example 2:
// *
// * Input: nums = [3,4,-1,1]
// * Output: 2
// * Example 3:
// *
// * Input: nums = [7,8,9,11,12]
// * Output: 1
// *
// *
// * Constraints:
// *
// * 1 <= nums.length <= 5 * 105
// * -231 <= nums[i] <= 231 - 1
// * Accepted
// * 612,126
// * Submissions
// * 1,723,044
// */
//public class SmallestMissingPositive {
//
//    public static void main(String[] args) {
//        System.out.println(missingSamllest(new int[]{0,2,3,5,6}));
//    }
//
//    public static int missingSamllest(int[] arr) {
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                arr[i] = 0;
//            }
//        }
//
//        for (int i = 1; i <= arr.length; i++) {
//            int index = i -1;
//            if (arr[index < 0) {
//                return i ;
//            } else if (arr[index] == 0) {
//                arr[index] = -1;
//            } else {
//                arr[index] *= -1;
//            }
//        }
//
//        return 0;
//    }
//}
