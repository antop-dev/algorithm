package com.leetcode

// https://github.com/antop-dev/algorithm/issues/584
class P2610 {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()
        // n이 몇번째 배열 위치까지 들어가 있는지 기록
        val memo = mutableMapOf<Int, Int>()

        for (n in nums) {
            val pos = (memo[n] ?: -1) + 1
            if (pos == ans.size) {
                ans += mutableListOf<Int>()
            }
            ans[pos] += n
            memo[n] = pos
        }

        return ans
    }
}
