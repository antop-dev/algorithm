package com.leetcode

// https://github.com/antop-dev/algorithm/issues/262
class P1247 {
    fun minimumSwap(s1: String, s2: String): Int {
        var xyPair = 0
        var yxPair = 0

        s1.zip(s2).forEach {
            if (it.first == 'x' && it.second == 'y') xyPair++
            else if (it.first == 'y' && it.second == 'x') yxPair++
        }

        if (xyPair % 2 != yxPair % 2) return -1
        return (xyPair / 2) + (yxPair / 2) + (xyPair % 2) + (yxPair % 2)
    }
}
