package com.leetcode


// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class P3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var ans = 0
        val map = mutableMapOf<Char, Int>()

        var i = 0
        for (j in s.indices) {
            println("i = $i, j = $j, c = ${s[j]},  map = $map")
            if (map.contains(s[j])) {
                i = maxOf(map[s[j]]!!, i)
            }
            ans = maxOf(ans, j - i + 1)
            map[s[j]] = j + 1
        }
        return ans
    }
}
