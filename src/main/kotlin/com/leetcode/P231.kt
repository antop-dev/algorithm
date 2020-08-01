package com.leetcode

// https://leetcode.com/problems/power-of-two/
class P231 {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n < 1) return false
        var m = n
        while (m > 1) {
            if (m % 2 != 0) return false
            m /= 2
        }
        return true
    }
}
