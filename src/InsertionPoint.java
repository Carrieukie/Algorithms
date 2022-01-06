public class InsertionPoint {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6,8,9,10},7));
    }

    public static int searchInsert(int[] nums, int target) {
        int left  = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = left + (right - left) / 2;

            if (nums[middle] == target){
                return middle;
            }

            if (nums[middle] < target){
                left = middle + 1;
            }else {
                right = middle - 1;
            }

        }
        return  (left + right) / 2 + 1;
    }

}
