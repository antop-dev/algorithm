package com.leetcode

// https://github.com/antop-dev/algorithm/issues/689
class P2749 {
    fun makeTheIntegerZero(num1: Int, num2: Int): Int {
        var k = 1
        while (true) {
            val x = num1 - (num2.toLong() * k)
            if (x < k) {
                return -1
            }
            if (k >= x.countOneBits()) {
                return k
            }
            k++
        }
    }
}