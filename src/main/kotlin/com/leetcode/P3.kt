package com.leetcode

// https://github.com/antop-dev/algorithm/issues/110
class P3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var ans = 0
        val sb = StringBuilder()
        for (ch in s) {
            if (ch in sb) {
                sb.delete(0, sb.indexOf(ch) + 1)
            }
            sb.append(ch)
            ans = maxOf(ans, sb.length)
        }
        return ans
    }
}
