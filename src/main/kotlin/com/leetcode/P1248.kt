package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/284
class P1248 {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        val window = LinkedList<Int>()
        var last = -1
        var count = 0

        for (i in nums.indices) {
            if (nums[i] % 2 == 1) window.addLast(i)
            if (window.size > k) last = window.removeFirst()
            if (window.size == k) count += window.peekFirst() - last
        }
        return count
    }
}
