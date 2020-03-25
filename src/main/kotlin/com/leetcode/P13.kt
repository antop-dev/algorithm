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

        for (i in s.length - 1 downTo 0) {
            val c = s[i]

            val n = map.getOrDefault(c, 0).run {
                this * when {
                    c == 'I' && (prev == 'V' || prev == 'X') -> -1
                    c == 'X' && (prev == 'L' || prev == 'C') -> -1
                    c == 'C' && (prev == 'D' || prev == 'M') -> -1
                    else -> 1
                }
            }

            sum += n
            println("c = $c, prev = ${prev}," +
                    " n = ${n.toString().padStart(5, ' ')}," +
                    " sum = ${sum.toString().padStart(5, ' ')}")
            prev = c
        }
        return sum
    }
}