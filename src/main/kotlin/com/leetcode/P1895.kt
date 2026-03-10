package com.leetcode

// https://github.com/antop-dev/algorithm/issues/727
class P1895 {
    companion object {
        const val ROW = 0
        const val COL = 1
        const val DIA1 = 2
        const val DIA2 = 3
    }

    fun largestMagicSquare(grid: Array<IntArray>): Int {
        val prefixSum = prefixSum(grid)
        var k = minOf(grid.size, grid[0].size)
        while (k > 1) {
            for (i in 0..grid.size - k) {
                for (j in 0..grid[i].size - k) {
                    if (check(prefixSum, i, j, k)) {
                        return k
                    }
                }
            }
            k--
        }
        return 1
    }

    // 대각1,대각2,행,열의 합이 모두 같은지 체크
    private fun check(prefixSum: Array<Array<IntArray>>, i: Int, j: Int, k: Int): Boolean {
        // 대각1 기준
        val sum = prefixSum[i + k][j + k][DIA1] - prefixSum[i][j][DIA1]
        // 대각2 비교
        val dia2 = prefixSum[i + k][j + 1][DIA2] - prefixSum[i][j + k + 1][DIA2]
        if (dia2 != sum) {
            return false
        }
        // 행 비교
        for (row in i until i + k) {
            if (prefixSum[row + 1][j + k][ROW] - prefixSum[row + 1][j][ROW] != sum) {
                return false
            }
        }
        // 열 비교
        for (col in j until j + k) {
            if (prefixSum[i + k][col + 1][COL] - prefixSum[i][col + 1][COL] != sum) {
                return false
            }
        }
        return true
    }

    // 행,열,대각선1,대각선2 누적합을 만듦
    private fun prefixSum(grid: Array<IntArray>): Array<Array<IntArray>> {
        val n = grid.size
        val m = grid[0].size
        val prefixSum = Array(n + 1) {
            Array(m + 2) {
                IntArray(4)
            }
        }
        for (i in 0 until n) {
            for (j in 0 until m) {
                prefixSum[i + 1][j + 1][ROW] = prefixSum[i + 1][j][ROW] + grid[i][j] // 행
                prefixSum[i + 1][j + 1][COL] = prefixSum[i][j + 1][COL] + grid[i][j] // 열
                prefixSum[i + 1][j + 1][DIA1] = prefixSum[i][j][DIA1] + grid[i][j]
                prefixSum[i + 1][m - j][DIA2] = prefixSum[i][m - j + 1][DIA2] + grid[i][m - j - 1]
            }
        }
        return prefixSum
    }
}
