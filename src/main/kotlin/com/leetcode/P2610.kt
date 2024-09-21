package com.leetcode

// https://github.com/antop-dev/algorithm/issues/584
class P2610 {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableSet<Int>>()

        loop@ for (n in nums) {
            var i = 0
            while (i < ans.size) {
                if (n !in ans[i]) {
                    ans[i] += n
                    continue@loop
                }
                i++
            }
            ans += mutableSetOf(n)
        }

        return ans.map { it.toList() }
    }
}
