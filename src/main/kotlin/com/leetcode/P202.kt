package com.leetcode

// https://leetcode.com/problems/happy-number/
class P202 {
    private val heap = mutableSetOf<Int>()

    fun isHappy(n: Int): Boolean {
        var m = n
        var sum = 0
        while (m > 0) {
            sum += (m % 10) * (m % 10)
            m /= 10
        }

        return when {
            sum == 1 -> true
            heap.contains(sum) -> false
            else -> {
                heap.add(sum)
                isHappy(sum)
            }
        }
    }
}
