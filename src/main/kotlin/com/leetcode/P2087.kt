package com.leetcode

// https://github.com/antop-dev/algorithm/issues/590
class P2087 {
    fun minCost(startPos: IntArray, homePos: IntArray, rowCosts: IntArray, colCosts: IntArray): Int {
        // 세로 방향 이동
        val y = cost(startPos[0], homePos[0], rowCosts)
        // 가로 방향 이동
        val x = cost(startPos[1], homePos[1], colCosts)
        return y + x
    }

    private fun cost(from: Int, to: Int, costs: IntArray): Int {
        var cost = 0
        val step = if (from < to) 1 else -1
        var i = from
        while (i != to) {
            i += step
            cost += costs[i]
        }
        return cost
    }
}
