package com.leetcode

// https://leetcode.com/problems/ransom-note/
class P383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val counter = mutableMapOf<Char, Int>()
        for (c in magazine) {
            counter[c] = counter[c]?.run { this + 1 } ?: 1
        }
        for (c in ransomNote) {
            counter[c] = counter[c]?.run { this - 1 } ?: -1
        }
        return !counter.any { it.value < 0 }
    }
}
