package com.leetcode

// https://github.com/antop-dev/algorithm/issues/264
class P46 {
    private val answer = mutableListOf<List<Int>>()

    fun permute(nums: IntArray): List<List<Int>> {
        dfs(mutableListOf(), nums.toMutableList())
        return answer
    }

    private fun dfs(x: MutableList<Int>, y: MutableList<Int>) {
        if (y.isEmpty()) {
            answer += x.toList()
            return
        }
        repeat(y.size) {
            x += y.removeAt(0)
            dfs(x, y)
            y += x.removeAt(x.lastIndex)
        }
    }

}
