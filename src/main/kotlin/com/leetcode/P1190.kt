package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/696
class P1190 {
    fun reverseParentheses(s: String): String {
        val stack = Stack<Char>()
        for (ch in s) {
            when (ch) {
                ')' -> {
                    val sb = StringBuilder()
                    // '('를 만나기 전까지 다 뽑아서 스택에 다시 넣음
                    while (stack.isNotEmpty()) {
                        val pop = stack.pop()
                        if (pop == '(') break
                        sb.append(pop)
                    }
                    sb.forEach { stack += it }
                }
                // '(', 'a' ~ 'z'
                else -> stack += ch
            }
        }
        return stack.joinToString("")
    }
}