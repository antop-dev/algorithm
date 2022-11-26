package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/435
class P2375 {
    fun smallestNumber(pattern: String): String {
        var n = 1
        val stack = Stack<Int>()
        val sb = StringBuilder()

        for (p in pattern + "I") {
            stack.push(n++)
            if (p == 'I') {
                while (stack.isNotEmpty()) {
                    sb.append(stack.pop())
                }
            }
        }
        return sb.toString()
    }

}
