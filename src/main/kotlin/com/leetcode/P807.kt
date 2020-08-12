package com.leetcode

// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
class P807 {

    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var total = 0
        val size = grid.size
        val left = Array(size) { 0 }
        val top = Array(size) { 0 }

        for (y in 0 until size) {
            for (x in 0 until size) {
                top[x] = maxOf(top[x], grid[y][x])
                left[y] = maxOf(left[y], grid[y][x])
            }
        }

        for (y in 0 until size) {
            for (x in 0 until size) {
                total += minOf(left[y], top[x]) - grid[y][x]
            }
        }

        return total
    }

}
