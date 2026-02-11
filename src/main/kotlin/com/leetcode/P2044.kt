package com.leetcode

// https://github.com/antop-dev/algorithm/issues/721
class P2044 {
    fun countMaxOrSubsets(nums: IntArray): Int {
        val max = nums.reduce { acc, v -> acc or v }
        return dfs(nums, max, 0, 0)
    }

    private fun dfs(nums: IntArray, max: Int, pos: Int, v: Int): Int {
        var count = if (v > 0 && max == v) 1 else 0
        for (i in pos until nums.size) {
            count += dfs(nums, max, i + 1, v or nums[i])
        }
        return count
    }
}
