package com.vidya;

/**
 * 62. Unique Paths
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 * <p>
 * Input: m = 3, n = 7
 * Output: 28
 * Example 2:
 * <p>
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 * Example 3:
 * <p>
 * Input: m = 7, n = 3
 * Output: 28
 * Example 4:
 * <p>
 * Input: m = 3, n = 3
 * Output: 6
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 100
 * It's guaranteed that the answer will be less than or equal to 2 * 109.
 */
public class UniquePaths {

    public static void main(String[] args) {

        System.out.println(findUniquePaths(3,7));
    }

    static int findUniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m-1][n-1];
    }
}
