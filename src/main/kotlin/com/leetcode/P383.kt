package com.leetcode

// https://github.com/antop-dev/algorithm/issues/216
class P383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val alphabet = IntArray(26) { 0 }
        for (ch in magazine) {
            alphabet[ch - 'a']++
        }
        for (ch in ransomNote) {
            val i = ch - 'a'
            alphabet[i]--
            if (alphabet[i] < 0) {
                return false
            }
        }
        return true
    }
}
