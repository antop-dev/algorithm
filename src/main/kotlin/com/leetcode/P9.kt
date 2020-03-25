package com.leetcode

import kotlin.math.abs
import kotlin.math.log10

class P9 {
    fun isPalindrome(x: Int): Boolean {
        return x >= 0 && x.toLong() == x.reverse()
    }

    /**
     * 정수를 뒤집는다.
     *
     * @return 뒤집었을 때 Int의 범위를 넘을 수 있으므로 Long 리턴
     */
    private fun Int.reverse(): Long {
        var r: Long = 0
        var x = this
        for (i in x.length() - 1 downTo 0) {
            r += (x % 10) * Math.pow(10.0, i.toDouble()).toInt()
            x /= 10
        }
        return r
    }

    /**
     * 정수의 자릿수를 구한다.
     */
    private fun Int.length() = when (this) {
        0 -> 1
        else -> log10(abs(toDouble())).toInt() + 1
    }
}