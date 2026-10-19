package com.leetcode

// https://github.com/antop-dev/algorithm/issues/795
class P3775 {
    fun reverseWords(s: String): String {
        val split = s.split(" ")
        val first = countVowel(split.first())

        val sb = StringBuilder(split.first())
        for (i in 1 until split.size) {
            var word = split[i]
            val count = countVowel(word)
            if (first == count) {
                word = word.reversed()
            }
            sb.append(" $word")
        }
        return sb.toString()
    }

    fun countVowel(s: String): Int {
        return s.count { it in "aeiou" }
    }
}
