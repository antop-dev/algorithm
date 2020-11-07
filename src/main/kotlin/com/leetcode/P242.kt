package com.leetcode

// https://leetcode.com/problems/valid-anagram/
class P242 {
    fun isAnagram(s: String, t: String): Boolean {
        val hash = mutableMapOf<Char, Int>()
        for (c in s) hash[c] = hash[c]?.plus(1) ?: 1
        for (c in t)hash[c] = hash[c]?.minus(1) ?: -1
        return !hash.any { it.value != 0 }
    }
}
