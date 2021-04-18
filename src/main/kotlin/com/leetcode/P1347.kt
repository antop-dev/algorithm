package com.leetcode

// https://github.com/antop-dev/algorithm/issues/237
// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
class P1347 {
    fun minSteps(s: String, t: String): Int {
        if (s == t) return 0
        val array = Array(26) { 0 }
        for (c in s) array[c.toInt() - 97]++
        for (c in t) array[c.toInt() - 97]--
        return array.filter { it > 0 }.sum()
    }
}

