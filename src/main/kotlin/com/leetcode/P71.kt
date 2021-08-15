package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/220
class P71 {
    fun simplifyPath(path: String): String {
        val paths = Stack<String>()
        for (p in path.split("/")) {
            when (p) {
                ".." -> if (paths.isNotEmpty()) paths.pop()
                ".", "" -> {
                    // do nothing
                }
                else -> paths.push(p)
            }
        }
        return "/" + paths.joinToString("/")
    }
}
