package com.leetcode

// https://github.com/antop-dev/algorithm/issues/522
class P1769 {
    fun minOperations(boxes: String): IntArray {
        val n = boxes.length
        val ans = IntArray(n)

        var travel = 0
        var ones = 0
        // this loop is for no. of operations for the no. of ones before the current index.
        for (i in boxes.indices) {
            travel += ones
            ans[i] = travel
            if (boxes[i] == '1') ones++
        }

        travel = 0
        ones = 0
        // this loop is for no. of operations for the no. of ones after the current index.
        for (i in boxes.indices.reversed()) {
            travel += ones
            ans[i] += travel
            if (boxes[i] == '1') ones++
        }

        return ans
    }
}
