package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/301
class P128 {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        val map = TreeMap<Int, Int?> { o1, o2 -> o1 - o2 }
        for (num in nums) {
            map[num] = null
            if (map.contains(num - 1)) map[num - 1] = num
            if (map.contains(num + 1)) map[num] = num + 1

            println()
            println("num = $num")
            for (e in map) {
                println("  ${e.key} -> ${e.value}")
            }
        }

        var maxLength = 0
        var length = 0
        for (e in map) {
            length++
            if (e.value == null) {
                maxLength = maxOf(maxLength, length)
                length = 0
            }
        }

        return maxLength
    }
}
