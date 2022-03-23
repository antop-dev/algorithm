package com.leetcode

// https://github.com/antop-dev/algorithm/issues/385
class P90 {
    private val answer = mutableSetOf<List<Int>>()

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        dfs(nums, mutableListOf(), 0)
        return answer.toList()
    }

    private fun dfs(nums: IntArray, pool: MutableList<Int>, i: Int) {
        if (i > nums.size || answer.contains(pool)) return
        answer += pool.toList()
        for (j in i until nums.size) {
            pool += nums[j]
            dfs(nums, pool, j + 1)
            pool.removeAt(pool.lastIndex)
        }
    }

}
