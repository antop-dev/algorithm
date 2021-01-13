package com.leetcode

import kotlin.math.pow

// https://leetcode.com/problems/excel-sheet-column-number/
class P171 {

    fun titleToNumber(s: String): Int {
        var n = 0.0
        for (i in s.indices) {
            val c = s[s.lastIndex - i]
            n += (c.toInt() - 64) * (26.0.pow(i))
        }
        return n.toInt()
    }

}
