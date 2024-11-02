package com.leetcode

// https://github.com/antop-dev/algorithm/issues/304
class P6 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }

        val x = numRows + (numRows - 2)
        val rows = Array(numRows) { StringBuilder() }

        s.forEachIndexed { i, c ->
            var j = i % x
            if (j >= numRows) {
                j = x - j
            }
            rows[j].append(c)
        }

        val sb = StringBuilder()
        for (row in rows) {
            sb.append(row)
        }

        return sb.toString()
    }
}
