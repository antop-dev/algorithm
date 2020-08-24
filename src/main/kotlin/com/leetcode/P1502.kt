package com.leetcode

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
class P1502 {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sorted().run {
            val diff = this[1] - this[0] // 2 <= arr.length
            for (i in 1..size / 2) {
                if (this[i] - this[i - 1] != diff
                    || this[lastIndex - i + 1] - this[lastIndex - i] != diff
                ) {
                    return false
                }
            }
            return true
        }
    }
}
