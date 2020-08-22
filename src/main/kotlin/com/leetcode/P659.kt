package com.leetcode

// https://leetcode.com/problems/split-array-into-consecutive-subsequences/
class P659 {
    fun isPossible(nums: IntArray): Boolean {
        // array[0] = last number
        // array[1] = length
        val list = mutableListOf<IntArray>()
        for (n in nums) {
            val pair = list.filter { n == it[0] + 1 }.minBy { it[1] }
            pair?.let {
                it[0] = n
                it[1]++
            } ?: list.add(intArrayOf(n, 1))

            println("n = $n")
            for (i in list.indices) {
                println("  list[$i] = ${list[i].contentToString()}")
            }
        }
        return list.all { it[1] >= 3 }
    }
}
