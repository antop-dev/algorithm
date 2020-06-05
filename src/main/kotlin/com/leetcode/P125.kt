package com.leetcode

// https://leetcode.com/problems/valid-palindrome/
class P125 {

    fun isPalindrome(s: String): Boolean {
        var i = 0
        var k = s.lastIndex
        while (i <= k) {
            if (!s[i].isLetterOrDigit()) {
                i++
            } else if (!s[k].isLetterOrDigit()) {
                k--
            } else {
                val x = with(s[i++]) { if (this >= 'a') this.minus(32) else this }
                val y = with(s[k--]) { if (this >= 'a') this.minus(32) else this }
                if (x != y) return false
            }
        }
        return true
    }

}
