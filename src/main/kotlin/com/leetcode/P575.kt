package com.leetcode

// https://leetcode.com/problems/distribute-candies/
class P575 {
    fun distributeCandies(candyType: IntArray): Int {
        val n = candyType.size
        val types = candyType.toSet()
        return minOf(n / 2, types.size)
    }
}
