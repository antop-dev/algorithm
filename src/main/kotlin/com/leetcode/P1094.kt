package com.leetcode

// https://github.com/antop-dev/algorithm/issues/356
class P1094 {

    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        val arr = IntArray(1000)
        for (trip in trips) {
            for (i in trip[1] until trip[2]) {
                arr[i] += trip[0]
                if (arr[i] > capacity) {
                    return false
                }
            }
        }
        return true
    }
}
