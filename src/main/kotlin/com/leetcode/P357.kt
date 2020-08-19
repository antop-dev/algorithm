package com.leetcode

// https://leetcode.com/problems/count-numbers-with-unique-digits/
class P357 {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        var count = 1
        var dp = 1
        for (k in 1..n) {
            dp *= 9 - k + 2
            // The first factor is 9 because a number cannot start with 0
            if (k == 1) dp--
            count += dp
        }
        return count
    }
}
