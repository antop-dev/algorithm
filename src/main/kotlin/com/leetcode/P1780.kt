package com.leetcode

import kotlin.math.pow

// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
class P1780 {
    fun checkPowersOfThree(n: Int): Boolean {
        return checkPowersOfThree(n, 0)
    }

    private fun checkPowersOfThree(n: Int, i: Int): Boolean {
        for (k in i..16) { // 3^16 is maximum in int
            val y = (3.0).pow(k).toInt()
            if (y == n) return true
            if (y > n) return false
            // y < n
            if (checkPowersOfThree(n - y, k + 1)) return true
        }
        return false
    }

}
