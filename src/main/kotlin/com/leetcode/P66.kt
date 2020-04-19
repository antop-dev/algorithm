package com.leetcode

// https://github.com/antop-dev/algorithm/issues/58
class P66 {
    fun plusOne(digits: IntArray): IntArray {
        val list = mutableListOf<Int>()
        var upper = 1
        for (i in digits.lastIndex downTo 0) {
            list.add(0, with(digits[i] + upper) {
                if (this == 10) {
                    upper = 1
                    0
                } else {
                    upper = 0
                    this
                }
            })
        }
        if (upper == 1) list.add(0, 1)
        return list.toIntArray()
    }
}