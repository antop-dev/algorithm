package com.leetcode

class P318 {
    fun maxProduct(words: Array<String>): Int {
        val n = words.size
        // 2진수로 변경
        // "a"     -> 00000000000000000000000001
        // "b"     -> 00000000000000000000000010
        // "ab"    -> 00000000000000000000000011
        // "zabc"  -> 10000000000000000000000111
        // "zzzzz" -> 10000000000000000000000000
        val bits = words.map { it.fold(0) { acc, ch -> acc or (1 shl ch - 'a') } }

        var ans = 0
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                if (bits[i] and bits[j] == 0) { // 겹치지 않는다.
                    ans = maxOf(ans, words[i].length * words[j].length)
                }
            }
        }
        return ans
    }
}