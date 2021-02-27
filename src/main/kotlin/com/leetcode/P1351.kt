package com.leetcode

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class P1351 {
    fun countNegatives(grid: Array<IntArray>): Int {
        return grid.sumBy { countNegatives(it) }
    }

    private fun countNegatives(array: IntArray): Int {
        for (i in array.indices) {
            if (array[i] < 0) return array.size - i
        }
        return 0
    }
}
