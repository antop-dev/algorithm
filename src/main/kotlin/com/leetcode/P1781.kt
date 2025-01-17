package com.leetcode

// https://github.com/antop-dev/algorithm/issues/619
class P1781 {
    fun beautySum(s: String): Int {
        val prefixSum = prefixSum(s)
        val n = s.length + 1
        var sum = 0
        for (i in 1 until n - 1) {
            for (j in i + 1 until n) {
                sum += beauty(prefixSum, i, j)
            }
        }
        return sum
    }

    private fun beauty(prefixSum: Array<IntArray>, i: Int, j: Int): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        for (k in 0 until 26) {
            val count = prefixSum[k][j] - prefixSum[k][i - 1]
            if (count == 0) {
                continue
            }
            min = minOf(min, count)
            max = maxOf(max, count)
        }
        return if (min > max) 0 else max - min
    }

    private fun prefixSum(s: String): Array<IntArray> {
        val arr = Array(26) { IntArray(s.length + 1) }
        s.forEachIndexed { x, ch ->
            val y = ch - 'a'
            arr[y][x + 1] = 1
        }
        for (i in arr.indices) {
            for (j in 1 until arr[i].size) {
                arr[i][j] += arr[i][j - 1]
            }
        }
        return arr
    }
}
