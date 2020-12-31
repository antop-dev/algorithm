package com.leetcode

// https://leetcode.com/problems/excel-sheet-column-title/
class P168 {
    private val pool = ('Z'..'Z') + ('A'..'Y')

    fun convertToTitle(n: Int): String {
        var s = ""
        var num = n
        while (num > 0) {
            var v = num / 26
            val m = num % 26
            if (m == 0) v--
            s = pool[m] + s
            num = v
        }
        return s
    }
}
