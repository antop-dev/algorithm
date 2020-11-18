package com.leetcode

// https://leetcode.com/problems/largest-substring-between-two-equal-characters/
class P1624 {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        var max = -1
        loop@ for (i in 0 until s.lastIndex) {
            for (j in s.lastIndex downTo i + 1) {
                if (s[i] == s[j]) {
                    max = maxOf(max, j - i - 1)
                    break
                }
            }
            if (s.length - 1 - i <= max) break@loop
        }
        return max
    }
}
