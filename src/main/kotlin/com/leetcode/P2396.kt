package com.leetcode

// https://github.com/antop-dev/algorithm/issues/560
class P2396 {
    fun isStrictlyPalindromic(n: Int): Boolean {
        for (radix in 2..(n - 2)) {
            val base = n.toString(radix)
            if (!isPalindrome(base)) {
                return false
            }
        }
        return true
    }

    private fun isPalindrome(s: String): Boolean {
        val len = s.length
        for (i in 0 until len / 2) {
            if (s[i] != s[len - i - 1]) {
                return false
            }
        }
        return true
    }
}
