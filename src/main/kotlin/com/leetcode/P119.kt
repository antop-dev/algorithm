package com.leetcode

// https://leetcode.com/problems/pascals-triangle-ii/
class P119 {
    fun getRow(rowIndex: Int): List<Int> {
        var prev = listOf(1)
        if (rowIndex >= 1) prev = listOf(1, 1)
        for (i in 2..rowIndex) {
            val list = MutableList(i + 1) { 1 }
            for (j in 1 until i) {
                list[j] = prev[j - 1] + prev[j]
            }
            prev = list
        }
        return prev
    }
}
