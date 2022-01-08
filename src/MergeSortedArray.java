import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};

        merge(nums1, 0, nums2, 1);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer = nums1.length - 1;
        m--;
        n--;

        while (n >= 0 && m >= 0) {

            if (nums1[m] > nums2[n]) {
                nums1[--pointer] = nums1[m];
                m--;

            } else {
                nums1[--pointer] = nums2[n];
                n--;

            }


        }
        while (n >= 0) {
            nums1[pointer--] = nums2[n--];
        }
        while (m >= 0) {
            nums1[pointer--] = nums1[m--];
        }

        System.out.println(Arrays.toString(nums1));

    }
}
