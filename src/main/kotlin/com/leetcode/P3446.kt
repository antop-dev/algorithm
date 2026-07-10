package com.leetcode

// https://github.com/antop-dev/algorithm/issues/761
class P3446 {
    fun sortMatrix(grid: Array<IntArray>): Array<IntArray> {
        val n = grid.size
        // [0][1~] : 오름차순
        for (c in 1 until n) {
            sort(grid, 0, c) { a, b -> a - b }
        }
        // [0~][0] : 내림차순
        for (r in 0 until n) {
            sort(grid, r, 0) { a, b -> b - a }
        }
        return grid
    }

    // [r][c]부터 대각선으로 버블정렬
    private fun sort(grid: Array<IntArray>, r: Int, c: Int, comparator: (Int, Int) -> Int) {
        val n = grid.size
        repeat(minOf(n - r, n - c)) {
            var i = r
            var j = c
            while (i < n - 1 && j < n - 1) {
                if (comparator(grid[i][j], grid[i + 1][j + 1]) > 0) {
                    val temp = grid[i][j]
                    grid[i][j] = grid[i + 1][j + 1]
                    grid[i + 1][j + 1] = temp
                }
                i++
                j++
            }
        }
    }
}
