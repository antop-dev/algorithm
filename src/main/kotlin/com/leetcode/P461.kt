package com.leetcode

// https://github.com/antop-dev/algorithm/issues/354
class P461 {
    fun hammingDistance(x: Int, y: Int): Int {
        var answer = 0
        var a = x
        var b = y

        while (a > 0 || b > 0) {
            val c = a % 2
            val d = b % 2
            if (c != d) answer++

            a /= 2
            b /= 2
        }

        return answer
    }
}
