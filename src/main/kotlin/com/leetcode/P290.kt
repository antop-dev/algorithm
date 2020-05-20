package com.leetcode

// https://leetcode.com/problems/word-pattern/
class P290 {
    fun wordPattern(pattern: String, str: String): Boolean {
        val split = str.split(" ")
        if (pattern.length != split.size) return false

        val map = mutableMapOf<Char, String>()
        for (i in pattern.indices) {
            val p = pattern[i]
            val s = split[i]

            if (map[p] == null) {
                if (map.values.any { it == s }) return false
                map[p] = s
            } else {
                if (map[p] != s) return false
            }

        }
        return true
    }
}
