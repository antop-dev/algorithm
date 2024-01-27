package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/220
class P71 {
    fun simplifyPath(path: String): String {
        val stack = Stack<String>()
        for (p in path.split('/')) {
            when (p) {
                ".." -> if (stack.isNotEmpty()) stack.pop()
                ".", "" -> { /* do nothing */
                }

                else -> stack.push(p)
            }
        }
        return "/" + stack.joinToString("/")
    }
}
