package com.leetcode

// https://leetcode.com/problems/consecutive-characters/
class P1446 {
    fun maxPower(s: String): Int {
        var maxPower = 1
        var power = 1
        for (i in 1 until s.lastIndex) {
            if (s[i - 1] == s[i]) {
                power++
            } else {
                maxPower = maxOf(maxPower, power)
                power = 1
            }
        }
        return maxOf(maxPower, power)
    }
}
