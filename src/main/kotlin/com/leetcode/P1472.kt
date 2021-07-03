package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/282
class P1472(homepage: String) {
    private val stack1 = Stack<String>()
    private var current = homepage
    private val stack2 = Stack<String>()

    fun visit(url: String) {
        stack1.push(current)
        current = url
    }

    fun back(steps: Int): String {
        repeat(steps) {
            if (stack1.isEmpty()) return@repeat
            stack2.push(current)
            current = stack1.pop()
        }
        return current
    }

    fun forward(steps: Int): String {
        if (stack2.size < steps) return current
        repeat(steps) {
            stack1.push(current)
            current = stack2.pop()
        }
        return current
    }

}
