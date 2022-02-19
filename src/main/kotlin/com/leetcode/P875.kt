package com.leetcode

import kotlin.math.ceil

// https://github.com/antop-dev/algorithm/issues/378
class P875 {

    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()!!
        var answer = right

        while (left <= right) {
            val mid = (left + right) / 2
            val eat = piles.sumBy { ceil(it.toDouble() / mid).toInt() }
            if (eat > h) {
                left = mid + 1
            } else {
                answer = mid
                right = mid - 1
            }
        }

        return answer
    }

}
