package com.leetcode

// https://github.com/antop-dev/algorithm/issues/764
class P991 {
    fun brokenCalc(startValue: Int, target: Int): Int {
        var ans = 0
        var n = target
        while (startValue < n) {
            if (n % 2 == 1) {
                n++
            } else {
                n /= 2
            }
            ans++
        }
        return ans + startValue - n
    }
}
