package com.leetcode

// https://github.com/antop-dev/algorithm/issues/445
class P179 {
    fun largestNumber(nums: IntArray): String {
        val ans = nums
            .sortedWith(Comparator { o1, o2 -> "$o2$o1".compareTo("$o1$o2") })
            .joinToString("")
        return if (ans[0] == '0') "0" else ans
    }
}
