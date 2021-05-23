package com.leetcode

// https://github.com/antop-dev/algorithm/issues/268
class P78 {
    private val answer = mutableListOf<List<Int>>()

    fun subsets(nums: IntArray): List<List<Int>> {
        dfs(nums, mutableListOf(), 0)
        return answer
    }

    private fun dfs(nums: IntArray, pool: MutableList<Int>, i: Int) {
        if (i > nums.size) return
        answer += pool.toList()
        for (j in i until nums.size) {
            pool += nums[j]
            dfs(nums, pool, j + 1)
            pool.removeAt(pool.lastIndex)
        }
    }

}
