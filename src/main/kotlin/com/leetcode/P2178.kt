package com.leetcode

// https://github.com/antop-dev/algorithm/issues/683
class P2178 {
    fun maximumEvenSplit(finalSum: Long): List<Long> {
        if (finalSum % 2 != 0L) return listOf()

        val ans = mutableListOf<Long>()
        var remain = finalSum
        var n = 2L
        while (remain - n > n) {
            ans += n
            remain -= n
            n += 2
        }
        ans += remain

        return ans
    }
}