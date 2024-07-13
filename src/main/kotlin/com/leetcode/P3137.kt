package com.leetcode

// https://github.com/antop-dev/algorithm/issues/569
class P3137 {
    fun minimumOperationsToMakeKPeriodic(word: String, k: Int): Int {
        var maxCount = 0
        val hash = mutableMapOf<String, Int>() // <부분 문자열, 개수>
        for (i in word.indices step k) {
            val substring = word.substring(i, i + k)
            val count = hash[substring]?.let { it + 1 } ?: 1
            maxCount = maxOf(maxCount, count)
            hash[substring] = count
        }
        val total = word.length / k
        return total - maxCount
    }
}
