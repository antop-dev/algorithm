package com.leetcode

// https://github.com/antop-dev/algorithm/issues/586
class P586 {
    fun maxJump(stones: IntArray): Int {
        var ans = 0
        stones.forEachIndexed { i, stone ->
            if (i >= 1) ans = maxOf(ans, stone - stones[i - 1])
            if (i >= 2) ans = maxOf(ans, stone - stones[i - 2])
        }
        return ans
    }
}
