package com.leetcode

// https://leetcode.com/problems/unique-paths-ii/
class P63 {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val n = obstacleGrid.size
        val m = obstacleGrid[0].size

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0
                    continue
                }

                obstacleGrid[i][j] = when {
                    i == 0 && j == 0 -> if (obstacleGrid[i][j] == 0) 1 else 0
                    i == 0 && j > 0 -> obstacleGrid[i][j - 1]
                    i > 0 && j == 0 -> obstacleGrid[i - 1][j]
                    else -> obstacleGrid[i][j - 1] + obstacleGrid[i - 1][j]
                }
            }
        }

        return obstacleGrid[n - 1][m - 1]
    }
}