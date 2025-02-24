package com.leetcode

import kotlin.math.log10
import kotlin.math.pow

// https://github.com/antop-dev/algorithm/issues/629
class P670 {
    fun maximumSwap(num: Int): Int {
        val len = len(num)
        var ans = num
        for (i in len downTo 2) {
            val j = find(num, i)
            if (j != -1) {
                ans = swap(num, i, j)
                break
            }
        }
        return ans
    }

    // i번째 수보다 크고 가장 멀리 있는 가장 큰 수를 찾는다.
    private fun find(num: Int, i: Int): Int {
        var j = -1;
        var max = digit(num, i)
        for (k in 1 until i) {
            val v = digit(num, k)
            if (v > max) {
                j = k
                max = v
            }
        }
        return j
    }

    private fun swap(num: Int, i: Int, j: Int): Int {
        val diff = digit(num, j) - digit(num, i)
        return num + number(diff, i) - number(diff, j)
    }

    private fun number(v: Int, pos: Int) = 10.0.pow(pos - 1).toInt() * v

    private fun digit(num: Int, pos: Int) = num / (10.0.pow(pos - 1).toInt()) % 10

    private fun len(num: Int) = log10(num.toDouble()).toInt() + 1
}
