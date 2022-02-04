public class CountRectangles {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 1, 1, 0}};

        System.out.println(numSubmat(matrix));
    }

    public static int numSubmat(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int ans = 0;

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    count = 0;
                }
                dp[i][j] = count;
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int res = Integer.MAX_VALUE;
                for (int k = i; k < row; k++) {
                    if (dp[k][j] == 0) break;
                    res = Math.min(dp[k][j], res);
                    ans += res;
                }
            }
        }
        return ans;
    }
}
