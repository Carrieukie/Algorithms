public class VersionControl {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int left = 0 ;
        int right = n;
        int ans = 0 ;

        while (left <= right){
            int middle = left + (right - left) / 2;

            if (isBadVersion(middle)) {
                ans = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }

        return ans;

    }

    private static boolean isBadVersion(int n) {
        return n >= 4;
    }

}
