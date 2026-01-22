package com.leetcode

import java.util.Stack

// https://github.com/antop-dev/algorithm/issues/715
class P503 {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n) { -1 }

        val stack = Stack<Int>()
        for (i in 0 until n * 2) {
            val num = nums[i % n]
            while (stack.isNotEmpty() && nums[stack.peek()] < num) {
                ans[stack.pop()] = num
            }
            if (i < n) {
                stack.push(i)
            }
        }

        return ans
    }
}
