package com.leetcode

import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/656
class P1471 {
    fun getStrongest(arr: IntArray, k: Int): IntArray {
        arr.sort()
        val m = arr[(arr.size - 1) / 2]
        var i = 0
        var j = arr.lastIndex
        val ans = IntArray(k)
        repeat(k) {
            if (abs(arr[i] - m) <= abs(arr[j] - m)) {
                ans[it] = arr[j--]
            } else {
                ans[it] = arr[i++]
            }
        }
        return ans
    }
}