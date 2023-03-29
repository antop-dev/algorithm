package com.leetcode

// https://github.com/antop-dev/algorithm/issues/475
class P1525 {
    fun numSplits(s: String): Int {
        val left = IntArray(26)
        val right = IntArray(26)
        val counter = intArrayOf(0, 0)

        for (c in s) {
            right[c - 'a']++
            if (right[c - 'a'] == 1) counter[1]++
        }

        var goodSplits = 0
        for (c in s) {
            val index = c - 'a'

            left[index]++
            if (left[index] == 1) counter[0]++

            right[index]--
            if (right[index] == 0) counter[1]--

            if (counter[0] == counter[1]) goodSplits++
        }
        return goodSplits
    }
}
