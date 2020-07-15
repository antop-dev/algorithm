package com.leetcode

// https://leetcode.com/problems/ugly-number/
class P263 {
    fun isUgly(num: Int): Boolean {
        var n = num
        val numbers = intArrayOf(5, 3, 2)

        var i = 0
        while (n > 1 && i < numbers.size) {
            while (n % numbers[i] == 0) {
                n /= numbers[i]
            }
            i++
        }
        return n == 1
    }
}
