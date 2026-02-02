package com.leetcode

// https://github.com/antop-dev/algorithm/issues/719
class P1552 {
    fun maxDistance(position: IntArray, m: Int): Int {
        position.sort()
        var left = 1
        var right = (position.last() - position.first()) / (m - 1)
        var ans = 0
        while (left <= right) {
            val force = (left + right) / 2
            if (check(position, m, force)) {
                ans = force
                left = force + 1
            } else {
                right = force - 1
            }
        }
        return ans
    }

    private fun check(position: IntArray, m: Int, force: Int): Boolean {
        var count = 1
        var prev = position[0]
        for (i in 1 until position.size) {
            if (position[i] - prev >= force) {
                count++
                prev = position[i]
            }
            if (count >= m) {
                return true
            }
        }
        return false
    }
}
