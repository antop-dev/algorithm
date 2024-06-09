package com.leetcode

// https://github.com/antop-dev/algorithm/issues/110
class P3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var ans = 0
        val map = mutableMapOf<Char, Int>()
        var anchor = 0
        s.forEachIndexed { i, ch ->
            map[ch]?.let { anchor = maxOf(anchor, it + 1) }
            ans = maxOf(ans, i - anchor + 1)
            map[ch] = i
        }
        return ans
    }
}
