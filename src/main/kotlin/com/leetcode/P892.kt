package com.leetcode

// https://leetcode.com/problems/surface-area-of-3d-shapes/
class P892 {
    fun surfaceArea(grid: Array<IntArray>): Int {
        // N * N
        val N = grid.size
        // 총 면수
        var total = 0

        for (i in 0 until N) {
            for (j in 0 until N) {
                // 한 블럭당 6면
                total += grid[i][j] * 6
                // 쌓는 블럭의 겹치는 부분 제거
                if (grid[i][j] > 0) {
                    total -= (grid[i][j] - 1) * 2
                }
            }
        }
        // 좌우 블럭의 겹치는 부분 제거
        for (i in 0 until N) {
            for (j in 0 until N - 1) {
                total -= minOf(grid[i][j], grid[i][j + 1]) * 2
            }
        }
        // 앞뒤 블럭의 겹치는 부분 제거
        for (i in 0 until N - 1) {
            for (j in 0 until N) {
                total -= minOf(grid[i][j], grid[i + 1][j]) * 2
            }
        }
        return total
    }
}
