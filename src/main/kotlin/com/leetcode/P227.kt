package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/167
// https://leetcode.com/problems/basic-calculator-ii/
class P227 {

    fun calculate(s: String): Int {
        val S = "$s+"
        val stack = Stack<Int>()
        var op = '+'
        var n = 0
        loop@ for (i in S.indices) {
            when (val c = S[i]) {
                ' ' -> continue@loop
                in '0'..'9' -> n = (n * 10) + (c - '0')
                else -> {
                    stack.push(
                        when (op) {
                            '-' -> n * -1
                            '*' -> stack.pop() * n
                            '/' -> stack.pop() / n
                            else -> n
                        }
                    )
                    n = 0
                    op = c
                }
            }
        }

        return stack.sum()
    }

}
