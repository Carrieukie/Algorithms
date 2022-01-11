import java.util.Arrays;

/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * Output: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image above.
 * Example 2:
 * <p>
 * Input: grid = [[1]]
 * Output: 4
 * Example 3:
 * <p>
 * Input: grid = [[1,0]]
 * Output: 4
 * <p>
 * <p>
 * Constraints:
 * <p>
 * row == grid.length
 * col == grid[i].length
 * 1 <= row, col <= 100
 * grid[i][j] is 0 or 1.
 * There is exactly one island in grid.
 */
public class IslandPerimeter {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        System.out.println(islandPerimeter(arr));
    }

    public static int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return islandPerimeter(grid, i, j);
                }
            }
        }
        return 0;
    }

    private static int islandPerimeter(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) return 0;
        grid[i][j] = -1;
        return islandPerimeter(grid, i + 1, j) +
                islandPerimeter(grid, i - 1, j) +
                islandPerimeter(grid, i, j + 1) +
                islandPerimeter(grid, i, j - 1);
    }

}
