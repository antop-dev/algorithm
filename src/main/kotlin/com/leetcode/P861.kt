package com.leetcode

// https://github.com/antop-dev/algorithm/issues/610
class P861 {
    fun matrixScore(grid: Array<IntArray>): Int {
        val n = grid.size
        // 열의 0 개수
        val zeros = IntArray(grid[n - 1].size)
        // 행의 맨 앞자리가 0이면 행을 뒤집는다.
        grid.forEach { row ->
            if (row[0] == 0) {
                toggleRow(row)
            }
            // 0의 개수를 센다.
            row.forEachIndexed { i, v ->
                if (v == 0) {
                    zeros[i]++
                }
            }
        }
        // 열의 0 개수가 과반수 이상이면 열을 뒤집는다.
        zeros.forEachIndexed { i, _ ->
            if (zeros[i] > n / 2) {
                toggleCol(grid, i)
            }
        }
        // 10진수로 합 계산
        return grid.sumOf { row -> toDecimal(row) }
    }

    // 행 뒤집기
    private fun toggleRow(row: IntArray) {
        for (i in row.indices) {
            row[i] = if (row[i] == 0) 1 else 0
        }
    }

    // 열 뒤집기
    private fun toggleCol(grid: Array<IntArray>, col: Int) {
        grid.forEach { row ->
            row[col] = if (row[col] == 0) 1 else 0
        }
    }

    // 행을 10진수로 변경
    private fun toDecimal(row: IntArray): Int {
        var v = 0
        var b = 1
        for (i in row.indices.reversed()) {
            if (row[i] == 1) {
                v += b
            }
            b *= 2
        }
        return v
    }
}
