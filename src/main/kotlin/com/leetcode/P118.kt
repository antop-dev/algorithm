package com.leetcode

// https://leetcode.com/problems/pascals-triangle/
class P118 {
    fun generate(numRows: Int): List<List<Int>> {
        return mutableListOf<List<Int>>().apply {
            if (numRows >= 1) add(listOf(1))
            if (numRows >= 2) add(listOf(1, 1))

            for (i in 3..numRows) {
                add(List(i) { idx -> if (idx in 1 until i - 1) last()[idx - 1] + last()[idx] else 1 })
            }
        }
    }
}
