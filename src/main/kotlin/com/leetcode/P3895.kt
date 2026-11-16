package com.leetcode

// https://github.com/antop-dev/algorithm/issues/802
class P3895 {
    fun countDigitOccurrences(nums: IntArray, digit: Int): Int {
        return nums.sumOf { num -> countDigit(num, digit) }
    }

    private fun countDigit(num: Int, digit: Int): Int {
        var count = 0
        var n = num
        while (n > 0) {
            if (n % 10 == digit) {
                count++
            }
            n /= 10
        }
        return count
    }
}
