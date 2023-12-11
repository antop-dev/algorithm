package com.leetcode

// https://github.com/antop-dev/algorithm/issues/528
class P494 {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        return dfs(nums, 0, target)
    }

    private fun dfs(nums: IntArray, i: Int, target: Int): Int {
        if (i >= nums.size) {
            return if (target == 0) 1 else 0
        }
        val pos = dfs(nums, i + 1, target + nums[i])
        val neg = dfs(nums, i + 1, target - nums[i])
        return pos + neg
    }
}
