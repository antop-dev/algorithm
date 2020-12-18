package com.leetcode

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class P167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        // target 보다 작은 수의 조합만 찾으면 된다.
        var endOfSearch = numbers.lastIndex - 1
        for (i in numbers.indices) {
            if (numbers[i] > target) {
                endOfSearch = i - 1
                break
            }
        }
        // Binary Search
        for (i in 0..endOfSearch) {
            val j = binarySearch(numbers, i + 1, numbers.lastIndex, target - numbers[i])
            if (j > -1) return intArrayOf(i + 1, j + 1)
        }
        // You may assume that each input would have exactly one solution and you may not use the same element twice.
        return IntArray(0)
    }

    private fun binarySearch(numbers: IntArray, s: Int, e: Int, target: Int): Int {
        if (s > e) return -1
        val m = (s + e) / 2
        return with(numbers[m]) {
            when {
                target < this -> binarySearch(numbers, s, m - 1, target)
                target > this -> binarySearch(numbers, m + 1, e, target)
                else -> m
            }
        }
    }
}
