package com.leetcode

// https://leetcode.com/problems/range-addition-ii/
class P598 {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        if (ops.isEmpty()) {
            return m * n
        }

        var x = Int.MAX_VALUE // min m
        var y = Int.MAX_VALUE // min n
        for (mn in ops) {
            x = minOf(x, mn[0])
            y = minOf(y, mn[1])
        }
        return x * y
    }
}
