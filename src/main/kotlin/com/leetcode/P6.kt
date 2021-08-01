package com.leetcode

// https://github.com/antop-dev/algorithm/issues/304
class P6 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s

        val x = numRows + (numRows - 2)
        val rows = Array(numRows) { "" }

        s.forEachIndexed { i, c ->
            var j = i % x
            if (j >= numRows) {
                j = x - j
            }
            rows[j] += "$c"
        }

        return rows.joinToString("")
    }
}
