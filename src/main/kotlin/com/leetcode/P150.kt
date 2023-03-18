package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/473
class P150 {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        for (token in tokens) {
            stack += when (token) {
                "+", "-", "*", "/" -> {
                    val y = stack.pop()
                    val x = stack.pop()
                    when (token) {
                        "+" -> x + y
                        "-" -> x - y
                        "*" -> x * y
                        // "/"
                        else -> x / y
                    }
                }

                else -> token.toInt()
            }
        }
        return stack.pop()
    }
}
