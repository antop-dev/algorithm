package com.leetcode

// https://github.com/antop-dev/algorithm/issues/750
class P3713 {
    fun findTheLongestBalancedSubstring(s: String): Int {
        var ans = 0
        val n = s.length
        for (i in 0 until n) {
            val hash = mutableMapOf<Char, Int>()
            for (j in i until n) {
                hash[s[j]] = (hash[s[j]] ?: 0) + 1
                if (hash.values.distinct().size == 1) {
                    ans = maxOf(ans, j - i + 1)
                }
            }
        }
        return ans
    }
}
