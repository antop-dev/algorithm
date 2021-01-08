package com.leetcode

// https://leetcode.com/problems/longest-palindrome/
class P409 {

    fun longestPalindrome(s: String): Int {
        val hash = mutableMapOf<Char, Int>()
        for (c in s) hash[c] = hash[c]?.run { this + 1 } ?: 1

        val answer = hash.values.sumBy { it / 2 * 2 }
        return answer + (if (s.length > answer) 1 else 0)
    }

}
