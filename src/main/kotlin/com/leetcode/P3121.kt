package com.leetcode

// https://github.com/antop-dev/algorithm/issues/742
class P3121 {
    fun numberOfSpecialChars(word: String): Int {
        val ascii = IntArray(126) { -1 }
        for (i in word.indices) {
            val ch = word[i]
            if (ch in 'a'..'z') { // 소문자는 마지막 위치 기억
                ascii[ch.code] = i
            } else if (ch in 'A'..'Z' && ascii[ch.code] == -1) { // 대문자는 처음 위치만 기억
                ascii[ch.code] = i
            }
        }
        var ans = 0
        for (ch in 'a'..'z') { // 모든 소문자가 대문자보다 앞에 있으면 스페셜
            val lower = ch.code
            val upper = ch.code - 32
            if (ascii[lower] > -1 && ascii[upper] > -1 && ascii[ch.code] < ascii[upper]) {
                ans++
            }
        }
        return ans
    }
}
