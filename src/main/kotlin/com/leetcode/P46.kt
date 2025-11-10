package com.leetcode

// https://github.com/antop-dev/algorithm/issues/264
class P46 {
    fun permute(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        val x = mutableListOf<Int>()
        val y = nums.toMutableList()
        dfs(ans, x, y)
        return ans
    }

    private fun dfs(ans: MutableList<List<Int>>, x: MutableList<Int>, y: MutableList<Int>) {
        if (y.isEmpty()) {
            ans += x.toList()
            return
        }
        repeat(y.size) {
            x += y.removeAt(0)
            dfs(ans, x, y)
            y += x.removeAt(x.lastIndex)
        }
    }
}
