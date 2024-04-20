package com.leetcode

// https://github.com/antop-dev/algorithm/issues/551
class P1476(private val rectangle: Array<IntArray>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (row in row1..row2) {
            for (col in col1..col2) {
                rectangle[row][col] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return rectangle[row][col]
    }

}
