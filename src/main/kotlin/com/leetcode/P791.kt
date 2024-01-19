package com.leetcode

// https://github.com/antop-dev/algorithm/issues/534
class P791 {
    companion object {
        const val MAX = 26;
    }

    fun customSortString(order: String, s: String): String {
        val sort = IntArray(26) { MAX }
        for (i in order.indices) {
            sort[order[i] - 'a'] = i
        }
        return s.toCharArray()
            .sortedBy { sort[it - 'a'] }
            .joinToString("")
    }
}
