package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/266
class P496 {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val hash = mutableMapOf(nums2.last() to -1)
        val stack = Stack<Int>().apply { push(nums2.last()) }

        for (i in nums2.lastIndex - 1 downTo 0) {
            val n = nums2[i]
            while (stack.isNotEmpty() && n > stack.peek()) {
                stack.pop()
            }
            hash[n] = if (stack.isEmpty()) -1 else stack.peek()
            stack.push(n)
        }

        return IntArray(nums1.size) { i -> hash[nums1[i]]!! }
    }
}
