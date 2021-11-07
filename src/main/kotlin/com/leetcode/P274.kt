package com.leetcode

// https://github.com/antop-dev/algorithm/issues/344
class P274 {
    fun hIndex(citations: IntArray): Int {
        citations.sortDescending()
        for (i in citations.indices) {
            if (i + 1 > citations[i]) {
                return i
            }
        }
        return citations.size
    }
}
