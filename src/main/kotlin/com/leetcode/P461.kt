package com.leetcode

// https://github.com/antop-dev/algorithm/issues/354
class P461 {
    fun hammingDistance(x: Int, y: Int): Int {
        var dist = 0
        var n = x.xor(y) // x ^ y

        while (n > 0) {
            dist += n.and(1)
            n = n.shr(1) // n >> 1
        }

        return dist
    }
}
