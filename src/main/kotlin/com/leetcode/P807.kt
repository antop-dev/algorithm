package com.leetcode

// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
class P807 {

    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val size = grid.size
        val left = IntArray(size)
        val top = IntArray(size)

        for (y in 0 until size) {
            for (x in 0 until size) {
                top[x] = maxOf(top[x], grid[y][x])
                left[y] = maxOf(left[y], grid[y][x])
            }
        }

        var total = 0
        for (y in 0 until size) {
            for (x in 0 until size) {
                total += minOf(left[y], top[x]) - grid[y][x]
            }
        }
        return total
    }

}
