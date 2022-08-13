package com.leetcode

class P13 {
    companion object {
        private val map = mapOf(
                'I' to 1,
                'V' to 5,
                'X' to 10,
                'L' to 50,
                'C' to 100,
                'D' to 500,
                'M' to 1000
        )
    }

    fun romanToInt(s: String): Int {
        var sum = 0
        var prev = ' '

        // IV = + 5 - 1
        // CM = + 1000 - 100
        for (c in s.reversed()) {
            var n = map[c]!!
            n *= when {
                c == 'I' && (prev == 'V' || prev == 'X') -> -1
                c == 'X' && (prev == 'L' || prev == 'C') -> -1
                c == 'C' && (prev == 'D' || prev == 'M') -> -1
                else -> 1
            }

            sum += n
            prev = c
        }
        return sum
    }
}
