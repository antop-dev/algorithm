package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/303
class P402 {
    fun removeKdigits(num: String, k: Int): String {
        val s = num + "0" // "${num}0" ?
        val stack = Stack<Char>()
        var removed = 0

        for (i in s.indices) {
            val n = s[i]
            while (stack.isNotEmpty() && stack.peek() > n) {
                if (removed == k) break
                stack.pop()
                removed++
            }

            if (!(stack.isEmpty() && n == '0') && i < s.lastIndex) {
                stack.push(n)
            }
        }

        val sb = StringBuilder()
        while (stack.isNotEmpty()) sb.insert(0, stack.pop())
        if (sb.isEmpty()) sb.append("0")
        return sb.toString()
    }
}
