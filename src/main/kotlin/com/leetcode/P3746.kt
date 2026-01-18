package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/717
class P3746 {
    fun minLengthAfterRemovals(s: String): Int {
        val stack = Stack<Char>()
        for (ch in s) {
            if (stack.isNotEmpty() && stack.peek() != ch) {
                stack.pop()
            } else {
                stack.push(ch)
            }
        }
        return stack.size
    }
}
